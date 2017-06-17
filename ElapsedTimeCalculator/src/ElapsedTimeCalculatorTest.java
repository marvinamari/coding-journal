
import calculator.ElapsedTimeCalculator;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARVIN
 */
public class ElapsedTimeCalculatorTest {
    
    public static void main(String[] args)
    {
        String startInput = JOptionPane.showInputDialog("Enter start time (i.e 2331):");
        int start = Integer.parseInt(startInput);
        
        String endInput = JOptionPane.showInputDialog("Enter end time (i.e. 2331)");
        int end = Integer.parseInt(endInput);
        
        ElapsedTimeCalculator timeModel = new ElapsedTimeCalculator(start, end);
        
        
        // Print Results
        System.out.println
        (
            "Starting Time: " + timeModel.getStartTime() + "\n"
            + "Ending Time: " + timeModel.getEndingTime() + "\n\n"
            + "Exactly " + timeModel.returnElapsedHours(start, end) + " Hour(s) and " + timeModel.returnMinutes(start, end) + " Minute(s)\n\n"
            + "Elapsed time in minutes: " + timeModel.elapsedCalculator(start, end) + "\n"
            + "Elapsed time in hours: " + timeModel.returnTotalElapsedHours(start, end) + "\n\n\n\n"
        
        );
        
       /**
        *  Change the values of previous object
        */
        String startInput2 = JOptionPane.showInputDialog("Enter NEW start time (i.e 2331):");
        start = Integer.parseInt(startInput2);
        
        timeModel.updateStart(start);
        
        String endInput2 = JOptionPane.showInputDialog("Enter NEW end time (i.e. 2331)");
        end = Integer.parseInt(endInput2);
        
        timeModel.updateEnd(end);
        
        // Print Results
        System.out.println
        (
            "New Starting Time: " + timeModel.getStartTime() + "\n"
            + "New Ending Time: " + timeModel.getEndingTime() + "\n\n"
            + "Exactly " + timeModel.returnElapsedHours(start, end) + " Hour(s) and " + timeModel.returnMinutes(start, end) + " Minute(s)\n\n"
            + "Elapsed time in minutes: " + timeModel.elapsedCalculator(start, end)
        );
        
        System.out.printf("Elapsed time in hours: %.2f%n", timeModel.returnTotalElapsedHours(start, end)); 
        
    }
    
}
