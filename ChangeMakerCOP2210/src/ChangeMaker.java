/*
 * File: ChangeMaker.java
 * 
 * Progtammer: Marvin Dore
 */

/** 
 * Computes the change due - using the minimum coinage necessary - when
 * the user enters the cost of a purchase and the amount tendered
 */
public class ChangeMaker 
{
    
    // instance Var's
    private double amountDue ;          // total cost of purchases
    private double amountTendered ;     // amount paid
    private int dollarsDue ;            // number of dollar coins to be given
    private int quartersDue ;           // number of quarters
    private int dimesDue ;              // number of dimes
    private int nickelsDue ;            // number of nickels
    private int penniesDue ;            // number of pennies
    
    /**
     *  Constructs a ChangeMaker Object
     * 
     * @param totalDue the amount of the purchase
     * @param amountReceived the amount tendered (paid)
     */
    public ChangeMaker (double totalDue, double amountReceived)
    {
        // initialize instance var's
        amountDue = totalDue ;
        amountTendered = amountReceived ;
        // other instance var's automatically initialized to 0
        System.out.printf("%nAmount Due:      $%7.2f", amountDue) ;
        System.out.printf("%nAmount Received: $%7.2f", amountTendered) ;
    }
    
    /**
     * Computes the number of coins of each denomination to be given
     */
    public void computeChange()
    {
        int changeDue ;     // total change due, in cents
        if (amountDue == amountTendered)
        {
            System.out.println("\nExact change! Thank you and have a nice "
                               + "day!") ;
        }
        else // change is due
        {
            // compute change due, in cents for easier calculations
            changeDue = (int)Math.round((amountTendered - amountDue) * 100) ;
            
            // compute the number of dollar coins due, and reduce the
            // change due accordingly
            dollarsDue = changeDue / 100 ; // note integer divide!
            changeDue = changeDue % 100 ;  // ...and mod operation
            
            // now do the same for all other coins
            quartersDue = changeDue / 25 ;
            changeDue =  changeDue % 25 ;
            
            dimesDue = changeDue / 10 ;
            changeDue = changeDue % 10 ;
            
            nickelsDue = changeDue / 5 ;
            changeDue = changeDue % 5 ;
            
            penniesDue = changeDue;         // change due is <= 4 cents
            
            // active change dispenser
            this.giveChange() ;
        }
    }
    
    // dispenses (i.e., prints) the coins comprising the change
    private void giveChange()
    {
        System.out.println("\nYour change:") ;
        if (dollarsDue != 0)
        {
            System.out.println("\t" + dollarsDue + " dollar(s)") ;
        }
        if (quartersDue != 0)
        {
            System.out.println("\t" + quartersDue + " quarter(s)") ;
        }
        if (dimesDue != 0)
        {
            System.out.println("\t" + dimesDue + " dime(s)") ;
        }
        if (nickelsDue != 0)
        {
            System.out.println("\t" + nickelsDue + " nickels(s)") ;
        }
        if (penniesDue != 0)
        {
            System.out.print("\t" + penniesDue) ;
            if (penniesDue == 1)
            {
                System.out.println(" penny");
            }
            else
            {
                System.out.println(" pennies");
            }
        }
        System.out.println("\nThanks and have a nice day!") ;
    }
} // end of ChangeMaker class declaration ===============================
