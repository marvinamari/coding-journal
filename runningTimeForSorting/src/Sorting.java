package src;
/**
 * @author  Marvin Dore
 * Assignment 3
 */
import java.sql.Time;

    public class Sorting {

    public void bubbleSort(int arr[])
    {

    int size = arr.length;
    for (int i = 0; i < size-1; i++)
        for (int j = 0; j < size-1; j++)
            if (arr[j] > arr[j+1])
            {
                // swap temp and arr[i]
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
 
    }

    /**
     * Sorts an array using bubble sort algorithm
     * Records start and ending times of algorithm
     * @param  myArr Array to be sorted
     * @return       Time taken to sort array
     */
    public long bubbleTime(int [] myArr)
    {
        long start = System.currentTimeMillis();
        this.bubbleSort(myArr);
        long end = System.currentTimeMillis();
        return end - start;

    }

    /**
     * Method algorithm from Geeks tutorial
     * @param arr Array to sort
     */
    public void selectionSort(int [] arr)
    {
        int size = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < size-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < size; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

    }



    /**
     * Sorts an array using selection sort
     * While recording start and end time
     * @param  myArr unsorted aray
     * @return       time taken to sort array
     */
    public long selectionTime(int [] myArr)
    {
        long start = System.currentTimeMillis();
        this.selectionSort(myArr);
        long end = System.currentTimeMillis();
        return end - start;
    }   

   
    /**
     * Recursive quicksort algorithm
     * @author Prof. A. Hernandez
     * Modified by Marvin Dore
     */
    private void quicksort(int [] list, int begin, int end)
    {
        int temp;
        int pivot = findPivotLocation(begin, end);

        // swap list[pivot] and list[end]
        temp = list[pivot];
        list[pivot] = list[end];
        list[end] = temp;

        pivot = end;

        int i = begin,
                j = end - 1;

        boolean iterationCompleted = false;
        while (!iterationCompleted)
        {
            while (list[i] < list[pivot])
                i++;
            while ((j >= 0) && (list[pivot] < list[j]))
                j--;

            if (i < j)
            {
                //swap list[i] and list[j]
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;

                i++;
                j--;
            } else
                iterationCompleted = true;
        }

        //swap list[i] and list[pivot]
        temp = list[i];
        list[i] = list[pivot];
        list[pivot] = temp;

        if (begin < i - 1) quicksort(list, begin, i - 1);
        if (i + 1 < end) quicksort(list, i + 1, end);
    }

    /*
     * Computes the pivot
     */
    private int findPivotLocation(int b, int e)
    {
        return (b + e) / 2;
    }

    public long quickTime(int [] myArr)
    {
        int first = 0;
        int last = myArr.length - 1;
        long start = System.currentTimeMillis();
        this.quicksort(myArr, first, last);
        long end = System.currentTimeMillis();
        return end - start;
    }

}