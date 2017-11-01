import java.util.Random;
/**
 * A smart computer cannot be beaten if it playes first unless
 * the pile size is 15, 31, 63
 * @author Marvin Dore
 */
public class SmartComputer extends Pile implements Player {
    
    private String name = "Smart Computer";     // computers name
    private int [] desiredPileSize = {1, 3, 7, 15, 31, 63}; // power of two minue 1
    Random num = new Random();  // generate pseudorandom numbers
    
    
    /**
     * calculates valid moves for computer to optimize chances of winning
     * reduces size of pile to a power of two minus one
     * @return best number of marbles to remove
     */
    public int move()
    {
        int max = Pile.getMarbles() / 2;
        int ans = 1;
        for (int i = 0; i <= max; i++)
        {
            if(Pile.getMarbles() - i == desiredPileSize[0])
                {
                    ans = i;
                }
            if(Pile.getMarbles() - i == desiredPileSize[1])
                {
                    ans = i;
                }
            if(Pile.getMarbles() - i == desiredPileSize[2])
                {
                    ans = i;
                }
            if(Pile.getMarbles() - i == desiredPileSize[3])
                {
                    ans = i;
                }
            if(Pile.getMarbles() - i == desiredPileSize[4])
                {
                    ans = i;
                }
            if(Pile.getMarbles() - i == desiredPileSize[5])
                {
                    ans = i;
                }
        }
        System.out.println(name + " has removed " + ans + " marbles from pile");
        return ans;
    }
    
    /**
     * Access computers name
     * @return name of computer
     */
    public String getName()
    {
        return name;
    }
}
