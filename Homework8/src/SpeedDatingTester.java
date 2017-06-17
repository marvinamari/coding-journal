
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amari
 */
public class SpeedDatingTester {
    
    public static void main(String[] args)
    {
        SpeedDating myDate = new SpeedDating();
        
        //Retrieve month of birth and convert into an integer
        String month = JOptionPane.showInputDialog("We will calculate your birthday"
                + "for the next 10 years. Enter your birth month (1-12)");
        int monthNum = Integer.parseInt(month);
        
        //Retrieve day of birth and convert into an integer
        String day = JOptionPane.showInputDialog("Enter birth day (1-31): ");
        int dayNum = Integer.parseInt(day);
        
        //Retrieve year of birth and convert into an integer
        String year = JOptionPane.showInputDialog("Enter year to start: ");
        int yearNum = Integer.parseInt(year);
        
        System.out.println("Your birthday for the next 10 years will fall on a:");
        myDate.haveTenHappys(monthNum, dayNum, yearNum);
        
        
        // When will Columbus Day be?
        String columbusYear = JOptionPane.showInputDialog("Enter a year e.g. 1980: ");
        int columbusNum = Integer.parseInt(columbusYear);
        
        System.out.println("\nColumbus day will be on: " + "[" +
                myDate.discoverColumbusDay(columbusNum).getLongDate() + "]" + " this year.");
        
        
        // Half way time calculator
        String startMonth = JOptionPane.showInputDialog("Enter starting Month: ");
        int startMonthNum = Integer.parseInt(startMonth);
        
        String startDay = JOptionPane.showInputDialog("Enter starting day: ");
        int startDayNum = Integer.parseInt(startDay);
        
        String startYear = JOptionPane.showInputDialog("Enter starting year: ");
        int startYearNum = Integer.parseInt(startYear);
        
        //End time
        String endMonth = JOptionPane.showInputDialog("Enter end month: ");
        int endMonthNum = Integer.parseInt(endMonth);
        
        String endDay = JOptionPane.showInputDialog("Enter end day: ");
        int endDayNum = Integer.parseInt(endDay);
        
        String endYear = JOptionPane.showInputDialog("Enter year: ");
        int endYearNum = Integer.parseInt(endYear);
        
        
        Date startDate = new Date(startMonthNum, startDayNum, startYearNum);
        Date endDate = new Date(endMonthNum, endDayNum, endYearNum);
        
        System.out.println("\nThe halfway date is:");
        myDate.getHalfWayDate(startDate, endDate);
        
    }
}
