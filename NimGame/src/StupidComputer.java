import java.util.Random;

/**
 * Stupid computer retrieves a valid random number of
 * marbles from the pile.
 * @author Marvin Dore
 */
public class StupidComputer extends Pile implements Player {
    private String name = "Stupid Computer";
    Random num = new Random();
    
    /**
     * Computes random number from 1 to half pile size
     * @return valid pseudorandom amount of marbles to remove
     */
    public int move()
    {
        int max = 1;
        if (Pile.getMarbles() > 1)
        {
            max = Pile.getMarbles() / 2;
        }
        int ans = num.nextInt(max) + 1;
        System.out.println(name + " has removed " + ans + " marbles from pile");
        return ans;
    }
    
    /**
     * Access computers name
     * @return name of the computer
     */
    public String getName()
    {
        return name;
    }
    
}
