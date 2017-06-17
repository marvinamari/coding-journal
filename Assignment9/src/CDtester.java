
import java.io.*;
import java.util.Scanner;


public class CDtester {
    
    public static void main(String[] args) throws IOException
    {
    
    File myFile = new File("input.txt");
    Scanner read = new Scanner(myFile);
    
    CDList myList = new CDList();
    
    while (read.hasNext())
    {
        int principal = read.nextInt();
        int maturity = read.nextInt();
        double rate = read.nextDouble();
        String comp = read.next();
        
        Cd input = new Cd(principal,rate,maturity,comp);
        myList.moreCD(input);
    }
    read.close();
    
    myList.printReports();
    }
    
}
