/**
 * Nim conducts the game and ensures Human 
 * selects a valid number of marbles to 
 * remove from the Pile from 1 to half
 * @author Marvin Dore
 */
public class Nim extends Pile {
    Human humanPlayer;          // Human user player
    SmartComputer smartPlayer;  // Smart opponent for human
    StupidComputer stupidPlayer;// Stupid appointent for user
    int playerOrder;            // Stores whether human want to go 1st or 2nd
    boolean playSmart;  // is true if playing smart computer false for stupid
    int whoWon = -1;    // records who won human = 1, smart = 2, stupid = 3
  
    
    /**
     * Creates players for current game and initializes 
     * name for the human.
     * @param myName name of user
     * @param s type of opponent to play agains
     * @param turn values 1 or 2 if player wants to play 1st or 2nd
     */
    public Nim(String myName, String s, int turn)
    {
        humanPlayer = new Human(myName);
        playerOrder = turn;
        if(s.equalsIgnoreCase("smart") ||
           s.equalsIgnoreCase("smart computer") ||
           s.equalsIgnoreCase("Smartcomputer"))
        {
            smartPlayer = new SmartComputer();
            playSmart = true;
            
        }
        else if (s.equalsIgnoreCase("stupid") ||
                 s.equalsIgnoreCase("stupidcomputer") ||
                 s.equalsIgnoreCase("stupid computer"))
        {
            stupidPlayer = new StupidComputer();
            playSmart = false;
        }
    }
    
    // Removes marbles from pile until pile reaches zero
    // Checks for winner after each removal
    public void play()
    {
        while(whoWon == -1)
        {
            if (playerOrder == 1 && playSmart )
            {
                System.out.println("Currnt pile size is: " + Pile.getMarbles());
                while(Pile.getMarbles() > 0)
                {
                    System.out.println(Human.ANSI_YELLOW + "========================================" + Human.ANSI_RESET);
                    Pile.removeMarbles(humanPlayer.move());
                    System.out.println("New pile size is: " + Pile.getMarbles() + "\n");
                    if (Pile.getMarbles() == 0)
                    {
                        whoWon = 2;
                    } else
                    {
                        Pile.removeMarbles(smartPlayer.move());
                        System.out.println("New pile size is: " + Pile.getMarbles() + "\n");
                        if (Pile.getMarbles() == 0)
                        {
                            whoWon = 1;
                        }
                    }
                }
            }
            else if (playerOrder == 1 && !playSmart)
            {
                System.out.println("Current pile size is: " + Pile.getMarbles());
                while(Pile.getMarbles() > 0)
                {
                    System.out.println(Human.ANSI_YELLOW + "========================================" + Human.ANSI_RESET);
                    Pile.removeMarbles(humanPlayer.move());
                    System.out.println("New pile size is: " + Pile.getMarbles() + "\n");
                    if (Pile.getMarbles() == 0)
                    {
                        whoWon = 3;
                    } else
                    {
                        Pile.removeMarbles(stupidPlayer.move());
                        System.out.println("New pile size is: " + Pile.getMarbles() + "\n");
                        if (Pile.getMarbles() == 0)
                        {
                            whoWon = 1;
                        }
                    }
                }
            }
            else if (playerOrder == 2 && playSmart)
            {
                System.out.println("Current pile size is: " + Pile.getMarbles());
                while(Pile.getMarbles() > 0)
                {
                    System.out.println(Human.ANSI_YELLOW + "========================================" + Human.ANSI_RESET);
                    Pile.removeMarbles(smartPlayer.move());
                    System.out.println("New pile size is: " + Pile.getMarbles() + "\n");
                    if (Pile.getMarbles() == 0)
                    {
                        whoWon = 1;
                    } else
                    {
                        Pile.removeMarbles(humanPlayer.move());
                        System.out.println("New pile size is: " + Pile.getMarbles() + "\n");
                        if (Pile.getMarbles() == 0)
                        {
                            whoWon = 2;
                        }
                    }
                }
            }
            else
            {
                System.out.println("Current pile size is: " + Pile.getMarbles());
                while(Pile.getMarbles() > 0)
                {
                    System.out.println(Human.ANSI_YELLOW + "========================================" + Human.ANSI_RESET);
                    Pile.removeMarbles(stupidPlayer.move());
                    System.out.println("New pile size is: " + Pile.getMarbles() + "\n");
                    if (Pile.getMarbles() == 0)
                    {
                        whoWon = 1;
                    } else
                    {
                        Pile.removeMarbles(humanPlayer.move());
                        System.out.println("New pile size is: " + Pile.getMarbles() + "\n");
                        if (Pile.getMarbles() == 0)
                        {
                            whoWon = 3;
                        }
                    }
                }
            }
        }
        if (whoWon == 1)
        {
            System.out.println(Human.ANSI_PURPLE + humanPlayer.getName() + "! you won this game" + Human.ANSI_RESET);
        }
        if (whoWon == 2)
        {
            System.out.println(Human.ANSI_PURPLE + "The smart computer won this time" + Human.ANSI_RESET);
        }
        if (whoWon == 3)
        {
            System.out.println(Human.ANSI_PURPLE + "The stupid computer won this time" + Human.ANSI_RESET);
        }
    }
}
