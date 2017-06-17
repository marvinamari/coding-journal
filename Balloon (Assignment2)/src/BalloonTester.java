/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marvin Dore
 */
public class BalloonTester {
    
    public static void main( String[] args)
    {
        // Create two balloons
        Balloon redBalloon = new Balloon( "redBalloon" , 100);
        Balloon blueBalloon = new Balloon( "blueBalloon", -50);
        
        
        // Print out the current values of our two objects
        System.out.print("First Balloon is: "+ redBalloon.getName() +" | "+"With Altitude: " 
                + redBalloon.getAltitude() + "meters" + "\n");
        System.out.print("Second Balloon is: "+ blueBalloon.getName() +" | "+"With Altitude: " 
                + blueBalloon.getAltitude() + "meters" + "\n\n");
        
        // Adjust current properties of the objects
        redBalloon.ascendTo(250);
        blueBalloon.adjustAltitude(150);
        
     
        
          // Print out the current values of our two objects
        System.out.print("First Balloon is: "+ redBalloon.getName() + " | "+"Altitude is now: " 
                + redBalloon.getAltitude() + "meters" + "\n");
        System.out.print("Second Balloon is: "+ blueBalloon.getName() +" | "+"Altitude is now: " 
                + blueBalloon.getAltitude() + "meters" + "\n\n");
        
        // 2nd adjustments 
        redBalloon.adjustAltitude(-150);
        redBalloon.ascendTo(blueBalloon.getAltitude());
        
        
        // Print out the current values of our two objects
        System.out.print("First Balloon is: "+ redBalloon.getName() +" | "+"Altitude is now: " 
                + redBalloon.getAltitude() + "meters" + "\n");
        System.out.print("Second Balloon is: "+ blueBalloon.getName() +" | "+"Altitude is now: " 
                + blueBalloon.getAltitude() + "meters" + "\n\n");
        
         // 3nd adjustments 
        
        redBalloon.adjustAltitude(redBalloon.getAltitude() * 3);
        blueBalloon.adjustAltitude(-200);
        
        
        // Print out the current values of our two objects
        System.out.print("First Balloon is: "+ redBalloon.getName() +" | "+"Altitude is now: " 
                + redBalloon.getAltitude() + "meters" + "\n");
        System.out.print("Second Balloon is: "+ blueBalloon.getName() +" | "+"Altitude is now: " 
                + blueBalloon.getAltitude() + "meters" + "\n");
        
        
    }
            
    
}
