package calculator;

/**
 * A class taking two times in military format and returns elapsed time in
 * minutes and hours also minutes or hours separately
 */
public class ElapsedTimeCalculator 
{
    // instance var's
    private int startingTime;           // starting military time e.g. 1700                           
    private int endingTime;             // ending military time e.g. 2100
    public static final int MINUTES = 60;   // converts hours to minutes
    public static final int CALCULATE = 100;    // seperates the hours and minutes portion of military time
    
    /**
     * Construct an elapsed time calculator storing a start and end time
     * 
     * @param start the starting time
     * @param end   the ending time
     */
    public ElapsedTimeCalculator(int start, int end)
    {
        this.startingTime = start;
        this.endingTime = end;
    }
    
    /**
     *  Gets the starting time
     * 
     *  @return the starting time
     */
    public int getStartTime()
    {
        return this.startingTime;
    }
    
    /**
     * Gets the ending time
     * 
     * @return the ending time
     */
     public int getEndingTime()
    {
        return  endingTime; 
    }
     
      /**
     *  Changes the start time
     *  
     * @param newStart new start time
     */
     public void updateStart(int newStart)
     {
         this.startingTime = newStart;
     }
     
     /**
      * Changes the end time
      * 
      * @param newEnd new End time
      */
     public void updateEnd(int newEnd)
     {
         this.endingTime = newEnd;
     }
     
     /**
      * Computes and returns the time elapsed in minutes
      * 
      * @param start starting time in military format e.g. 1700
      * @param end ending time in military format e.g. 2100
      * @return elapsed time in minutes
      */
     public int elapsedCalculator(int start, int end)
     {
         int minutesEnd = ((end % CALCULATE) + ((end / CALCULATE)* MINUTES));   //convert end time from military format to minute format
         int minutesStart = ((start % CALCULATE) + ((start / CALCULATE)* MINUTES)); //convert start time from military format to minute format
         return (minutesEnd - minutesStart);    // return the elapsed time
     }
     
     /**
     *  Computes and returns elapsed time in hours
     * 
     *  @param start starting time in military format
     *  @param end ending time in military format
     * @return elapsed time in hours
     */
     public int returnElapsedHours(int start, int end)
     {
         int timeElapsed =  elapsedCalculator(start, end);  //computes elapsed time in minutes
         int hours = (timeElapsed / MINUTES);   //computes hours from minutes elapsed
         return hours;
     }
     
     /**
      * Computes and returns elapsed time in minutes
      * 
      * @param start starting time in military format
      * @param end ending time in military format
      * @return elapsed time in minutes
      */
     public int returnMinutes(int start, int end)
     {
         int timeElapsed = elapsedCalculator(start, end);   //computes elapsed time in minutes
         int minutes = (timeElapsed % MINUTES); //compute minutes portion of elapsed time
         return minutes;    //returns elapsed time in minutes
     }
     
     /**
      * Computes and returns total elapsed hours in decimal form
      * 
      * @param start starting time in military format
      * @param end ending time in military format
      * @return elapsed hours in decimal form e.g. 2.75 hours
      */
     public double returnTotalElapsedHours(double start, double end)
     {
            double time = elapsedCalculator((int)start , (int)end); //computes elapsed time in minutes
            double hours = time / MINUTES;  //converts time into hours keeping decimal portion
            return hours;   //returns elaped time in decimal format
     }
}
