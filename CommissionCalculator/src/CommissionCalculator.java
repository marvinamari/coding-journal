/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marvin Dore
 */
public class CommissionCalculator {
    private String name;
    private double sales;
    private int service;
    private String rank;
    // constants
    public static final int SALES_TARGET_1 = 100000;
    public static final int SALES_TARGET_2 = 200000;
    public static final int SALES_TARGET_3 = 300000;
    public static final int SALES_TARGET_4 = 400000;
    public static final double JRANKCOMM = 0.001;
    public static final double SRANKCOMM = 0.002;
    
    public CommissionCalculator( String employeeName, double monthlySales, int yearsService, String myRank)
    {
        this.name = employeeName;
        this.sales = monthlySales;
        this.service = yearsService;
        this.rank = myRank;
    }
    
    public double rankCommission()
    {
        double commission;
        
        if ( rank.equals("J") || rank.equals("j") || rank.equals("2"))
        {
            commission = sales * JRANKCOMM;
        }
        else if (rank.equals("S") || rank.equals("s") || rank.equals("3"))
        {
            commission = sales * SRANKCOMM;
        }
        else
        {
            commission = 0;
        }
        
        return commission;
    }
    
    public String ranking()
    {
        String ranking;
        if ( rank.equals("J") || rank.equals("j") || rank.equals("2"))
        {
            ranking = "Junior";
        }
        else if (rank.equals("S") || rank.equals("s") || rank.equals("3"))
        {
            ranking = "Senior";
        }
        else
        {
            ranking = "Apprentice";
        }
        
        return ranking;
    }
    
    public double monthlyCommission()
    {
        double commission;
        if (sales > SALES_TARGET_4)
        {
            commission = sales * 0.02;
        }
        else if (sales > SALES_TARGET_3)
        {
            commission = sales * 0.0175;
        }
        else if (sales > SALES_TARGET_2)
        {
            commission = sales * 0.015;
        }
        else if (sales > SALES_TARGET_1)
        {
            commission = sales * 0.01;
        }
        else 
        {
            commission = 0;
            
        }
        return commission;
    }
    
    public double anniversary()
    {
        double commission;
        
        switch (service)
        {
            case 0:
                commission = 0;
                break;
            case 1: 
                commission = sales * 0.001;
                break;
            case 2: 
                commission = sales * 0.002;
                break;
            case 3: 
                commission = sales * 0.003;
                break;
            case 4: 
                commission = sales * 0.004;
                break;
            case 5: 
                commission = sales * 0.005;
                break;
            case 6:
                commission = sales * 0.006;
                break;
            case 7: 
                commission = sales * 0.007;
                break;
            case 8: 
                commission = sales * 0.008;
                break;
            case 9: 
                commission = sales * 0.009;
                break;
            default:
                commission = sales * 0.01;
                
        }
        return commission;
    }
    
    public void allInput()
    {
        
        System.out.printf("The employee name is: %s"  
                          +"\nMonthly sales total: $%.2f"
                          +"\nYears of service: %d"
                          +"\nEmployee rank: %s", name, sales, service, ranking()
                          );
    }
    public void totalCommission()
    {
        double total = anniversary() + monthlyCommission() + rankCommission();
        System.out.printf("\n\nTotal commission: $%.2f\n", total);  
    }
    
}
