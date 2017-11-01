
import java.util.Scanner;

/**
 *  Test the Nim game
 * @author Marvin Dore
 */
public class NimGameTest {
    public static Scanner in = new Scanner(System.in);  // Access scanner between classes
    public static void main(String [] args)
    {
        System.out.println("Please enter your name: ");
        String name = NimGameTest.in.next();
        System.out.println("----------");
        System.out.println("Hello " + name +"!");
       
        
        String leaveLoop = "yes";
        String response = null;
        
        while( leaveLoop.equalsIgnoreCase("yes"))
        {
            int leave = 0;
            
            while(leave == 0){
             System.out.println("Would you like to play against a smart computer"
                           + " or a stupid computer today?\n" + "Enter smart or"
                           + " stupid");
            response = NimGameTest.in.next();
            if (response.equalsIgnoreCase("stupid") ||
                 response.equalsIgnoreCase("stupid computer") ||
                 response.equalsIgnoreCase("stupidcomputer") ||
                 response.equalsIgnoreCase("smart") ||
                 response.equalsIgnoreCase("smartcomputer") ||
                 response.equalsIgnoreCase("smart computer"))
            {
                leave = 1;
                break;
            }
                    
            System.out.print("Your response is invalid, please enter Smart or "
                            + "Stupid for the difficulty to play the computer");
            response = NimGameTest.in.next();
            }
        
        
        
        String turn;
        leave = 1;
        do
        {
            System.out.println(name + ", would you like to go 1st or 2nd: Enter "
                                    + "1 or 2");
            turn = NimGameTest.in.next();
            if(turn.equalsIgnoreCase("1") || turn.equalsIgnoreCase("2"))
                    {
                        leave = 0;
                    }
        } while (leave != 0);
        
        int takeTurn = Integer.parseInt(turn);
        
        
            Nim game = new Nim(name, response, takeTurn);
            game.play();
            System.out.println("Would you like to play again? ");
            leaveLoop = in.next();
        }
        NimGameTest.in.close();
    }
}
