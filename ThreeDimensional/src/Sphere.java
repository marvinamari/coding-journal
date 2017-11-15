/**
 *
 * @author Marvin Dore
 */
public class Sphere extends ShapeIn3D {
    private int radius;
    
    /**
     * Creates a sphere object and stores a center
     * Point representing three dimensions
     * @param x x-axis
     * @param y y-axis
     * @param z z-axis
     * @param radius radius of a sphere
     */
    public Sphere(int x, int y, int z, int radius)
    {
        super(x,y,z);
        this.radius = radius;
    }
    
    /**
     * Get name of class
     * @return class name
     */
    public String name()
    {
        return "Sphere";
    }
    
    /**
     * Calculates the are of a sphere 
     * Via formula 4 * PI * radius^2
     * @return 
     */
    public double surfaceArea()
    {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }
    
    /**
     * Calculates the volume of a sphere
     * Via formula 4/3 * PI * radius^3
     * @return volume of sphere
     */
    public double volume()
    {
        return (4.0/3) * Math.PI * Math.pow(this.radius, 3) ;
    }
    
    /**
     * Print data stored in object as a string
     * @return string holding all data in object
     */
    public String toString()
    {
        return  String.format("Sphere\nLocated at: %s\nRadius of: %d\nSurface " 
                + "area: %.2f\nVolume: %.2f\n", super.toString(), radius, 
                this.surfaceArea(), this.volume() );
    }
}
