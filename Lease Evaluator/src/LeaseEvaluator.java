/**
 *
 * @author Marvin Dore
 */
public class LeaseEvaluator {
    
// instance var's
    private String customerName;
    private double monthlyPayment;
    private int leaseTerm;
    private double downPayment;
    private int annMaxFreeMiles;
    private int milesDriven;
    private double chargePerMile;
    private double total;
    
    public LeaseEvaluator( String customer, double monthly, int lease,
    double down, int annMax, int miles, double chargePer)
            {
                customerName = customer;
                monthlyPayment = monthly;
                leaseTerm = lease;
                downPayment = down;
                annMaxFreeMiles = annMax;
                milesDriven = miles;
                chargePerMile = chargePer;
                
            }
    
    public String getName()
    {
        return this.customerName;
    }
    public double getMonthly()
    { 
        return this.monthlyPayment;
    }
    public int getLease()
    {
        return this.leaseTerm;
    }
    public double getDown()
    {
        return this.downPayment;
    }
    public int getMax()
    {
        return this.annMaxFreeMiles;
    }
    public int getMiles()
    {
        return this.milesDriven;
    }
    public double getCharge()
    {
        return this.chargePerMile;
    }
    
    public void changePayment(double monthly)
    {
        monthlyPayment = monthly;
    }
    
    public double totalCharges()
    {   
            double inYears = this.leaseTerm / 12;
            total = (((this.downPayment + (this.monthlyPayment * this.leaseTerm) + 
                    (this.milesDriven - (this.annMaxFreeMiles* inYears)) * (this.chargePerMile))/
                    this.leaseTerm) * 1.07);
            return total;
        
    }
    
}
