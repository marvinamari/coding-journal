/**
 *
 * @author Marvin Dore
 */
public class LeaseEvaluatorTester 
{
    
    public static void main( String[] args)
    {
        LeaseEvaluator objectOne = new LeaseEvaluator ( "Marvin Dore" , 239,  
        36, 1915, 10500, 45678, 0.25);
    
      
        //
         System.out.println("Customer Name: " + objectOne.getName() + "\n" +
                            "Monthly Payment: " + objectOne.getMonthly() + "\n" +
                            "Term of lease: " + objectOne.getLease() + "\n" +
                            "Down Payment: " + objectOne.getDown() + "\n" +
                            "Max free miles: " + objectOne.getMax() + "\n" +
                            "Miles Driven: " + objectOne.getMiles() + "\n" +
                            "Charge Per Mile: " + objectOne.getCharge() );
         
         // print the ACPM
         double acpm = objectOne.totalCharges() ;
         System.out.println( "The annual cost per month: " + acpm + "\n\n");
                                  
         // change current ACPM
         objectOne.changePayment(219);
         
         // recalculate ACPM
         acpm = objectOne.totalCharges() ;
         
         // print new ACPM and new monthly payment
        System.out.println( "Your New Monthly Payment Is: " + objectOne.getMonthly() + "\n" +
                            "Therefore Your New ACPM is: " + acpm + "\n");
         
    }
}
