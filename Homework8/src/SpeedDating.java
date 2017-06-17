
/**
 * A class to give students experience using loops.  This class
 * creates and manipulates objects of Greg's Date class.
 */
 public class SpeedDating
 {
    // Note: this class has no instance variables!
 	
    /**
     * Create an empty SpeedDating object
     * (this is known as a "default" constructor)
     */
     public SpeedDating()
     {}	   // Constructor has empty body
 	
    /**
     * Prints the day of the week (e.g. "Thursday") on which the user's
     * birthday will fall for 10 consecutive years
     * Precondition: the birthday is not February 29th
     * @param month the month of the birthday
     * @param day the day of the birthday
     * @param startYear the first of the 10 consecutive years
     */
     public void haveTenHappys(int month, int day, int startYear)
     {
         
         //Create a variable "counter" store the value of startYear
         //add the number of year iterations to the year  for computing
         int counter = startYear;
         
         for (int i = 0; i < 10; i++)
         {
             int j = i + 1;
             Date startDate = new Date(month, day, counter + i);
             String days = startDate.getDayOfWeek();
             System.out.println(j + ": " + days);           
         }
     }
 	
    /**
     * Computes and returns the Date on which Columbus Day will fall 
     * in a given year.
     *
     * NOTE: By law, Columbus Day is the second Monday in October
     *
     * @param year the year for which to compute the date of Columbus Day
     * @return the date of Columbus Day for the specified year
     */
     public Date discoverColumbusDay(int year)
     {
         // Create a date object and intialize a counter variable
         //Use the counter variable to count occurrences of Monday 
         Date ColumbusVal = new Date(10, 01, year);
         int count = 0;
         
         
         for (int i = 0; i < 31; i++)
         {
             if (ColumbusVal.getDayOfWeek().equals("Monday"))
             {
                 count++;
             }
             if (count == 2)
             {
                break;
             }
             else
             {
                ColumbusVal.next();
             }
             
         }
         return ColumbusVal;
         // temporary return statement so class skeleton will compile         
         
     }

 	 	
     /**
      * Returns the date that lies midway between two dates.
      * 
      * Precondition: The start date must occur on or before the end date.
      * 
      * @param start the earlier of the two dates
      * @param end the later of the two dates
      * 
      * @return the Date halfway between the start date and the end date 
      */
      public Date getHalfWayDate(Date start, Date end) 
      {
 	 // NOTE: Do NOT modify the parameters "start" or "end" in this method!
         // Doing so will modify the arguments in the calling method.
         // Instead, use one (or both) of the copies created below:

         Date d1 = new Date(start.getMonth(), start.getDay(), start.getYear()) ;
 	 Date d2 = new Date(end.getMonth(), end.getDay(), end.getYear()) ;
         Date d3 = new Date(start.getMonth(), start.getDay(), start.getYear()) ;
         
        // Counts number of days from starting date to ending date
        // divide total number of days by 2 to find halfway 
        // add halfway point days from starting point to get halfway date
         int count = 0;
         while(!d1.equals(d2))
         {
             count++;
             d1.next();
         }
         int days = count / 2;
         for (int i = 0; i < days; i++)
         {
             d3.next();
         }
         //System.out.println(days);
         System.out.println(d3.getShortDate());
                   
         return d3 ;
      }
 }