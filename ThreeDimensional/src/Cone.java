/**
 *
 * @author Marvin Dore
 */
public class Cone extends ShapeIn3D{
    private int height; // Height of cone
    private int radius; // Radius of cone
    
    /**
     * Create a cone and positions it somewhere in space
     * Using a 3 coordinate point for shapes center
     * @param xCoo x-axis
     * @param yCoo y-axis
     * @param zCoo z-axis
     * @param height cone height for cone to create
     * @param radius cone radius for cone to create
     */
    public Cone(int xCoo, int yCoo, int zCoo, int height, int radius)
    {
        super(xCoo, yCoo, zCoo);
        this.height = height;
        this.radius = radius;
    }
    
    /**
     * Get name of class
     * @return class name
     */
    public String name()
    {
        return "Cone";
    }
    /**
     * Compute volume area via (PI r2 h)/3	
     * @return volume area of cone
     */
    public double volume()
    {
        return (Math.PI * (this.radius * this.radius) * this.height) / 3;
    }
    
    /**
     * Compute surface area of cone via PI r(r + s)
     * Where s is sqrt of height^2 * radius^2
     * @return 
     */
    public double surfaceArea()
    {
        return Math.PI * this.radius * Math.sqrt((this.radius * this.radius) +
                                                (this.height * this.height));
    }
    
    
    public String toString()
    {
        return String.format("Cone\nLocated at: %s\nHeight: %d\nRadius: %d\nSurface area:"
                + " %.2f\nVolume: %.2f\n", super.toString(), this.height, this.radius,
                this.surfaceArea(), this.volume());
    }
}
