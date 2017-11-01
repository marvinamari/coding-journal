
import java.util.Random;
import java.util.Scanner;

/**
 *@author Marvin Dore
 * Creates a pile of Marbles from which players can pull from
 */
public abstract class Pile {
    private static int marble;   // marbles contained in pile
    
    //Create a pile with random amount 10 to 100 (inclusive) marbles
    public Pile()
    {
        Random setSize = new Random();
        marble = setSize.nextInt(81) + 10;  // store random marble amount
       
    }
    
    /**
     * reduces static variable marbles
     * @param move amount subtracted from Pile
     */
    public static void removeMarbles(int move)
    {
        marble -= move;
    }
    
    /**
     * Access how many marbles remaining in Pile
     * @return value in static marbles variable
     */
    public static int getMarbles()
    {
        return marble;
    }
    
}
