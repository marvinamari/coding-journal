package src;
import java.lang.reflect.Array;


public class Hash {
	public Hash [] myHash;

	public Hash()
	{
		myHash = new Hash[67];
		for (int i = 0; i < myHash.length; i++)
		{
			myHash[i] = new LinkedList();
		}
	}
	public static int collision(int [] arr)
	{
		int count = 0;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				if (arr[i] == arr[j])
				{
					count++;
				}
			}
		}
		return count;
	}

	// public void addHash(String arr)
	// {
	// 	Node []
	// }
	public static int hash(String key, int tableSize)
	{
		int hashVal = 0;

		for( int i = 0; i < key.length(); i++)
		{
			hashVal = 51 * hashVal + key.charAt(i);
		}

		hashVal %= tableSize;
		if( hashVal < 0)
		{
			hashVal += tableSize;
		}

		return hashVal;
	}
    public static void main(String [] args)
    {
    	String [] arr = {"abstract", "boolean", "break", "byte", "case",
					"catch", "char", "class", "const *", "continue",
					"default", "do", "double", "else", "extends",
					"final", "finally", "float", "for", "goto *", "if",
					"implements", "import", "instanceof", "int", "interface",
					"long", "native", "new", "null", "package", "private",
					"protected", "public", "return", "short", "static",
					"super", "switch", "synchronized", "this", "throw",
					"throws", "transient", "try", "void", "volatile", "while",
					"assert", "enum", "strictfp"
 };

 	Hash hello = new Hash();

 	for (int i = 0; i < arr.length; i++)
 	{
 		
 		hello[Hash.hash(arr[i], 51)] = arr[i];
 	}

 	System.out.println("Number of collisions " + Hash.collision(arr2));
    }
}
