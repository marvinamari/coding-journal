
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marvin Dore
 */
public class NumbersGameTester {
    public static void main(String[] args)
    {
        String bet_type = JOptionPane.showInputDialog("Straight Bet enter \"S\" | Box Bet enter \"B\"");
        String bet_amount = JOptionPane.showInputDialog("How much to bet");
            int betAmount = Integer.parseInt(bet_amount);
        String player_num = JOptionPane.showInputDialog("What are your numbers?");
            int playerNum = Integer.parseInt(player_num);
        String winning_num = JOptionPane.showInputDialog("What are the winning numbers?");
            int winningNum = Integer.parseInt(winning_num);
        
        NumbersGame play = new NumbersGame(bet_type, betAmount, playerNum, winningNum);
        
        //play.printWinner();
        
        play.winnerOrNot();
        if (play.getWinner())
        {
            System.out.println("Congratulations You Won: $" + play.getWinAmount() +
                               "\nFrom your bet of: $" + bet_amount) ;
        }
        else 
        { 
            System.out.println("Sorry You Are Not A Winner.");
        }
    }
    
}
