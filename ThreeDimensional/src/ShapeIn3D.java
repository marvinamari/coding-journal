/**
 *
 * @author Marvin Dore
 */
public abstract class ShapeIn3D implements Comparable<ShapeIn3D> {
    private Point3D shapeCenter;
    
    /**
     * Computes the surface area of shape
     * @return surface area
     */
    public abstract double surfaceArea();
    /**
     * Computes volume of shape
     * @return volume
     */
    public abstract double volume();
    
    /**
     * Gets the name of the class
     * @return class name
     */
    public abstract String name();
    
    public ShapeIn3D(int x, int y, int z)
    {
        shapeCenter = new Point3D(x, y, z);
    }
    
    /**
     * Calculate distance from object center to origin
     * @return 
     */
    public double distnceFromOrigin()
    {
       int x = shapeCenter.getX() * shapeCenter.getX(); // x squared
       int y = shapeCenter.getY() * shapeCenter.getY(); // y squared
       int z = shapeCenter.getZ() * shapeCenter.getZ(); // z squared
       return Math.sqrt(x + y + z);
    }
    
    /**
     * Compares Shapes ordering them by volume
     * @param o ShapeIn3D object to be compared
     * @return -1 for less than, 1 for greater and 0 for equal
     */
    public int compareTo(ShapeIn3D o)
    {
        if (this.volume() - o.volume() < 0)
        {
            return -1;
        }
        else if (this.volume() - o.volume() > 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    /**
     * Calls toString method of Point3D
     * @return 
     */
    public String toString()
    {
        return this.shapeCenter.toString();
    }
    
    
}
