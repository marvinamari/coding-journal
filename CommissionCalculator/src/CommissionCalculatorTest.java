
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marvin
 */
public class CommissionCalculatorTest {

    public static void main(String[] args) 
    {
        //Employee Questions
        String name = JOptionPane.showInputDialog("Enter Salespersons Name: ");
        String monthlySales = JOptionPane.showInputDialog("Monthly sales: ");
        double sales = Double.parseDouble(monthlySales);
        String yearsService = JOptionPane.showInputDialog("Years of service: ");
        int service = Integer.parseInt(yearsService);
        String rankCode = JOptionPane.showInputDialog("Enter your rank as \"a, A, or 1\""
                + " For Apprentice, \"j, J, or 2\" for Junior, \"s, S, or 3\""
                + " For Senior");

        CommissionCalculator employee = new CommissionCalculator(name, sales, service, rankCode);

        employee.allInput();
        employee.totalCommission();

    }
}
