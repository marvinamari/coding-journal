
import java.util.ArrayList;


public class CDList {
    private ArrayList<Cd> myCD;
    
    
    /**
     * Constructs an empty array list
     */
    public CDList()
    {
        myCD = new ArrayList<Cd>();
    }
    
    /**
     * Adds one item to the array list
     * @param item object that will be added to list
     */
    public void moreCD(Cd item)
    {
        myCD.add(item);
    }
    
    /**
     * Print a text string for each year of a Cd's existence
     * each year displays the performance of a specific Cd until
     * it's maturity
     */
    public void printReports()
    {           
      int max = 0;  
      
      for(int n = 0; n < myCD.size(); n++)
      {
          
          if (myCD.get(n).getMaturity() > max)
          {
              max = myCD.get(n).getMaturity();
          }
      }
      
      for (int z = 0; z < max; z++)
      {
      // for each account in this bank
      //for ( int i = 0 ; i < myCD.size() ; i++ )
      double totalInterest = 0;
      double annualInterest = 0;
      double totalVal = 0;
      {  
              // print report number
      System.out.println("Report Year " + (z+1) + "\n") ;
        // print headings
      System.out.printf("%10s%7s%7s%14s%16s%18s%18s%n","Principal","Term","Rate",
              "Compounding","Current Value","Annual Interest","Total Interest") ;
      
      System.out.printf("%10s%7s%7s%14s%16s%18s%18s%n","==========",
              "====","====","===========",
              "=============","===============","===============") ; 
         
      for( int j = 0; j < myCD.size(); j++)
      {
         Cd current = myCD.get( j ) ;	  // get CD
         
         
         if (z+1 <= myCD.get(j).getMaturity())
         {
         // print account number and balamce to screen
         System.out.printf("%,10d%,7d%,7.2f%14s%,16.2f%,18.2f%,18.2f%n",current.getPrincipal(),
                           current.getMaturity(), current.getInterestRate(),
                           current.getMode(), current.accumulatedValue(z+1),
                           current.accumulatedValue(z+1) - current.accumulatedValue(z),
                           current.totalInterest(current, z+1));
         totalInterest += current.totalInterest(current, z+1);
         annualInterest += (current.accumulatedValue(z+1) - current.accumulatedValue(z));
         totalVal = totalVal + (current.accumulatedValue(z+1));
         
         }
          
      }
      
      //Print footer report
      System.out.printf("%nTotal Interest earned this year: $ %,.2f%n"
                        + "Total Interest earned to date: $ %,.2f%n" +  
                        "Total Accumulated Value: $ %,.2f%n%n%n%n" 
                        ,annualInterest,totalInterest,totalVal);
      }
      }
    }
}
