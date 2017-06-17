/**
 * Creates a CD object to model certificates of deposits
 * financial instruments that grow over a set period of time
 * 
 */
public class Cd {
    private int principal;          //total investment deposit to start cd
    private double interestRate;    //interest amount applied to the principal
    private int maturity;           //number of years to apply interest
    private String mode;            //how frequently to apply interest
    
    /**
     * Construct a Cd object
     * @param prin principal amount deposited which should accrue interest
     * @param inter Interest rate applied to the principal
     * @param mat Term of investment how many years to apply interest
     * @param mo  Mode of compounding daily, monthly or quarterly
     */
    public Cd(int prin, double inter, int mat, String mo)
    {
        principal = prin;
        interestRate = inter/100.0;
        maturity = mat;
        mode = mo;
    }
    /**
     * Access principal instance variable
     * @return value of principal in the CD
     */
    public int getPrincipal()
    {
        return principal;
    }
    
    /**
     * Access the interest rate
     * @return value of Interest for the CD
     */
    public double getInterestRate()
    {
        return interestRate * 100;
    }
    
    /**
     * Access the maturity amount
     * @return value of Maturity in the CD
     */
    public int getMaturity()
    {
        return maturity;
    }
    
    /**
     * Access the mode of CD
     * @return what mode of accumulation should be used
     */
    public String getMode()
    {
        return mode;
    }
    
    /**
     * Compute accumulated interest based upon the desired compounding rate
     * @param year term in which CD should be compounded for
     * @return  principal + interest earned as of the year being calculated
     */
    public double accumulatedValue(int year)
    {
        double accumulate = 0;
        int pound;
        
        if (mode.equalsIgnoreCase("Daily"))
        {
            pound = 365;
        }
        else if (mode.equalsIgnoreCase("Monthly"))
        {
            pound = 12;
        }
        else
        {
             pound = 4;
        }
        accumulate =  principal* Math.pow((1 + interestRate/pound), (pound*year));
        return accumulate;
    }
    /**
     * Compute interest by subtracting accumulation amount by principal
     * @return interest only for that year
     */
    public double interest(Cd object, int year)
    {
        double output;
        output = object.accumulatedValue(year) - this.principal;
        
        return output;
    }
    
    /**
     * Calculates total interest for specific year
     * @param Object for which to calculate interest for
     * @param year specific year to calculate interest
     * @return total accumulated value minus principal
     */
    public double totalInterest(Cd Object, int year)
    {
       
        return Object.accumulatedValue(year) - this.principal;
        
      
    }
    
    
}
