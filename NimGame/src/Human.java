/**
 * Creates a human player with access to static pile
 * @author Marvin Dore
 */
public class Human extends Pile implements Player {
    private String myName;  // name obtained in the console
    public static final String ANSI_RESET = "\u001B[0m"; //Make console font normal
    public static final String ANSI_CYAN = "\u001B[36m"; //change console font to Cyan
    public static final String ANSI_YELLOW = "\u001B[33m"; // change console font to Yello
    public static final String ANSI_PURPLE = "\u001B[35m"; // change console font purple
    
    public Human(String name)
    {
        myName = name;
    }
    
    /**
     * Tests human input to ensure valid move and restricting cheating
     * @return entered value if it is a valid move
     */
    public int move()
    {
        int ans = 1;    // number of marbles to return, default of one
        int max = 0;    // maximum number of marbles which can be removed
        
        // Calculate half the pile and store value in max
        // If max is zero via integer division make max one
        if(Pile.getMarbles()/2 == 0)
        {
            max = 1;
        } else { max = Pile.getMarbles()/2;}
        
        System.out.println("How many marbles would you like to remove? ");
        System.out.println(ANSI_CYAN + "Max is: " + max + ANSI_RESET);
        int response = NimGameTest.in.nextInt();    //input coming from console
        
        //Loop while response is not between 1 and half inclusive
        while (!(response > 0 && response <= (Pile.getMarbles()/2)) && response != 1)
        {
            System.out.println("You must remove marbles not exceeding half the "
                               + "current pile.");
            response = NimGameTest.in.nextInt();
        }
        ans = response;
        System.out.println(myName + " has removed " + ans + " marbles from pile");
        return ans;
    }
    
    /**
     * Name accessor
     * @return humans name
     */
    public String getName()
    {
        return myName;
    }
    
}
