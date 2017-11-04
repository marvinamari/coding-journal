package src;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
* Created a text file of sorting algorithm run times
* @author Marvin Dore
* Assignment 3
*/
public class WritingToTextFile
{
    public static void main(String[] args)
    {
        String outputFilename = "output.csv";
        
        PrintWriter output = null;
        //open output stream
        try
        {
            output = new PrintWriter(new FileWriter(outputFilename));
        } catch (IOException ex)
        {
            System.exit(1);
        }

        Sorting obj = new Sorting();
        Random rnd = new Random();
        int arraySize = 1000;
        output.println("Array Size, Bubble Sort, Selection Sort, QuickSort");
        for (int i = 0; i < 100; i++)
        {
            int [] values = new int [arraySize];
            for(int j = 0; j < values.length; j++)
            {
                values[i] = rnd.nextInt(100);
            }
            output.println(arraySize + "," + obj.bubbleTime(values) + ","
                          + obj.selectionTime(values) + "," 
                          + obj.quickTime(values));
            arraySize += 1000;
        }
        //close output stream
        output.close();
    }
}