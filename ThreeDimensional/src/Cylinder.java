/**
 * Models a cylinder in three dimensional space
 * @author Marvin Dore
 */
public class Cylinder extends ShapeIn3D{
    private int height;
    private int radius;
    
    /**
     * Create cylynder object with a center located
     * At a three dimensional point in space
     * @param x x-axis
     * @param y y-axis
     * @param z z-axis
     * @param height Cylinder height
     * @param radius  Cylinder radius
     */
    public Cylinder(int x, int y, int z, int height, int radius)
    {
        super(x,y,z);
        this.height = height;
        this.radius = radius;
    }
    
    /**
     * Get name of the objects class
     * @return class name
     */
    public String name()
    {
        return "Cylinder";
    }
    
    /**
     * Calculate the volume of a Cylinder
     * Via formula PI * R^2 * height
     * @return volume of cylinder
     */
    public double volume()
    {
        return Math.PI * Math.pow(radius, 2) * this.height;
    }
    
    /**
     * Caclulates the area of a cylinder
     * Using formula 2 * PI * r2 + 2 * PI * r * h
     * @return area of a cylinder
     */
    public double surfaceArea()
    {
        return (2 * Math.PI * Math.pow(radius, 2)) + 
               (2 * Math.PI * this.radius * this.height);
    }
    
    /**
     * Creates a string of all values stored within the object
     * @return string representation of variable values
     */
    public String toString()
    {
        return  String.format("Cylinder\nLocated at: %s\nHeight of: %d\nRadius: " 
                + "%d\nSurface area: %.2f\nVolume: %.2f\n", super.toString(), this.height, 
                this.radius, this.surfaceArea(), this.volume() );
    }
}
