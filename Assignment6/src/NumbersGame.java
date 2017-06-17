/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marvin Dore
 */
public class NumbersGame 
{
    
    // Instance Var's
    private String bet_type;
    private int bet_amount;
    private int playersNum;
    private int winningNum;
    private boolean isWinner;
    private int winningAmount;
    
    /**
     * Constructor function
     * @param bet_type string to determine type of bet
     * @param bet_amount currency amount of bet to be placed
     * @param playersNum numbers entered into bet 
     * @param winningNum  winning numbers of bet
     */
    public NumbersGame (String bet_type, int bet_amount, int playersNum, int winningNum)
    {
        this.bet_type = bet_type;
        this.bet_amount = bet_amount;
        this.playersNum = playersNum;
        this.winningNum = winningNum;
        this.isWinner = false;
    }
    
    /**
     * @param num number needing to be calculated
     * @return first number of sequence
     */
    public int NumberOne(int num)
    {
        int numberone;
        numberone = num / 100;
        return numberone;
    }
    
    /**
     * @param num number needing to be calculated
     * @return second number of sequence
     */
    public int NumberTwo(int num)
    {
        int numbertwo;
        numbertwo = (num/10) - (NumberOne(num) * 10);
        return numbertwo;
    }
    
    /**
     * @param num number needing to be calculated
     * @return third number of sequence
     */
    public int NumberThree(int num)
    {
        int numberthree;
        numberthree = num % 10 ;
        return numberthree;
    }
    
    /**
     * This method checks each number of the played characters against
     * each of the winning characters one by one.
     * Returns true or false and stores winning total 
     */
    public boolean isBox()
    {
        if (NumberOne(playersNum) != NumberTwo(playersNum) && NumberOne(playersNum) != NumberThree(playersNum) && NumberTwo(playersNum) != NumberThree(playersNum))
        {
            if (NumberOne(winningNum) != NumberTwo(winningNum) && NumberOne(winningNum) != NumberThree(winningNum) && NumberTwo(winningNum) != NumberThree(winningNum))
            {
               
                if (NumberOne(playersNum) == NumberOne(winningNum) || NumberOne(playersNum) == NumberTwo(winningNum) || NumberOne(playersNum) == NumberThree(winningNum))
                {
                    if (NumberTwo(playersNum) == NumberOne(winningNum) || NumberTwo(playersNum) == NumberTwo(winningNum) || NumberTwo(playersNum) == NumberThree(winningNum))
                    {
                        if (NumberThree(playersNum) == NumberOne(winningNum) || NumberThree(playersNum) == NumberTwo(winningNum) || NumberThree(playersNum) == NumberThree(winningNum))
                        {
                            isWinner = true;
                            winningAmount = 100 * bet_amount;
                        }
                        else { isWinner = false;}
                    } else { isWinner = false;}
                } else { isWinner = false;}
           
            }else { isWinner = false;}
        }
        else if (NumberOne(playersNum) == NumberTwo(playersNum) || NumberOne(playersNum) == NumberThree(playersNum) || NumberTwo(playersNum) == NumberThree(playersNum))
        {
            if (NumberOne(winningNum) == NumberTwo(winningNum) || NumberOne(winningNum) == NumberThree(winningNum) || NumberTwo(winningNum) == NumberThree(winningNum))
            {
                if (NumberOne(playersNum) == NumberOne(winningNum) || NumberOne(playersNum) == NumberTwo(winningNum) || NumberOne(playersNum) == NumberThree(winningNum))
                {
                    if (NumberTwo(playersNum) == NumberOne(winningNum) || NumberTwo(playersNum) == NumberTwo(winningNum) || NumberTwo(playersNum) == NumberThree(winningNum))
                    
                        { if (NumberThree(playersNum) == NumberOne(winningNum) || NumberThree(playersNum) == NumberTwo(winningNum) || NumberThree(playersNum) == NumberThree(winningNum))
                            {
                                isWinner = true;
                                winningAmount = 200 * bet_amount;
                            }
                            else { isWinner = false;}
                        }else { isWinner = false;}
                }
            else { isWinner = false;}
        } else { isWinner = false;}
            
        } else { isWinner = false;}
        
        return isWinner;
    }
    /**
     * Function calculates if player numbers is a winner
     * Based on bet type
     * Also calculates the winning amount for straight only
     */
    public void winnerOrNot()
    {
        if (this.bet_type.equals("S") || this.bet_type.equals("s"))
        {
            if (playersNum == winningNum)
                this.isWinner = true;
                winningAmount = bet_amount * 600;
        }
        else if (this.bet_type.equals("B") || this.bet_type.equals("b"))
        {
            isBox();
        }
            
    }
    
    
    /**
     * Get boolean value if winner
     * @return 
     */
    public boolean getWinner ()
    {
        return isWinner;
    }
    
    /**
     * Get winning value amount
     * @return 
     */
    public int getWinAmount ()
    {
        return winningAmount;
    }
} 

 /**
     * Method prints out if player is a winner or not
     */
//    public void printWinner()
//    {
//        winnerOrNot();
//        if (isWinner)
//        {
//            System.out.println("Congratulations You Won: $" + winningAmount +
//                               "\nFrom your bet of: $" + bet_amount) ;
//        }
//        else 
//        { 
//            System.out.println("Sorry You Are Not A Winner.");
//        }
//    }
