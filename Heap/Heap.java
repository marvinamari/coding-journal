package src;

public class Heap 
{
	private int [] list;
	private int length = list.length;
	
	public Heap()
	{
		length = 0;
		list = new int [100];
		
	}
    public void add (int x)
    {
    	int loc = ++length;

    	while (loc > 1 && x < list[loc/2])
    	{
    		list[loc] = list[loc/2];
    		loc /= 2;
    	}
    	list[loc] = x;
    }

    public void remove (int x)
    {
    	int lastItem =list[length];
    	length--;

    	int parent = 1;
    	while (parent * 2 <= length)
    	{
    		int child = parent * 2;

    		if (child != length && list[child + 1] < list[child])
    			child++;
    		if (list[child] < lastItem)
    			list[parent] = list[child];
    		else break;
    		parent = child;
    	}
    	list[parent] = lastItem;
    }

    //return the min value
    public int min()
    {
    	return list[1];
    	// int loc = list.length - 1;
    	// while (list[loc] > list[loc/2] && loc > 0)
    	// {
    	// 	loc /= 2;
    	// }
    	// return list[loc];
    }

    public void heapsort()
    {
    	int [] arr = new int [list.length];
    	for (int i = 0; i < list.length; i++)
    	{
    		int min = this.min();
    		arr[i] = min;
    		this.remove(min);
    	}
    }

    public static void main (String [] args)
    {
    	Heap hello = new Heap();
    	for (int i = 0; i < 100; i++)
		{
			hello.add(i);
		}
    	System.out.println(hello.min());
    }
}

