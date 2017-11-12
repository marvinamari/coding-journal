/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Represent a point in three dimensional space
 * @author Marvin Dore
 */
public class Point3D {
    private int xCoordinate;    // x axis location value
    private int yCoordinate;    // y axis location value
    private int zCoordinate;    // z axis location value
    
    /**
     * Creates an object which represents a point in 3 dimensional space
     * @param x x-axis coordinate in space
     * @param y y-axis coordinate in space
     * @param z z-axis coordinate in space
     */
    public Point3D(int x, int y, int z)
    {
        xCoordinate = x;
        yCoordinate = y;
        zCoordinate = z;
    }
    
    /**
     * Access x-axis coordinate
     * @return x-axis
     */
    public int getX()
    {
        return xCoordinate;
    }
    
    /**
     * Access y-axis coordinate
     * @return y-axis
     */
    public int getY()
    {
        return yCoordinate;
    }
    
    /**
     * Access z-axis coordinate
     * @return z-axis
     */
    public int getZ()
    {
        return zCoordinate;
    }
    
     /**
     * Print the coordinates of an object in
     * (x,y,z) format where x,y, and z are
     * Coordinate values in space
     * @return Coordinates as a string
     */
    public String toString()
    {
      
        return "(" + this.getX() + ", " + this.getY() + ", " + this.getZ() + ")";
    }
}
