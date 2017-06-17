// File: SphereTester.java

/**
 * A class to represent a sphere.
 */
class Sphere {
    // instance var

    private double radius ;	   // the radius of the sphere

    /**
     * Create a Sphere object with a given radius.
     * @param theRadius the radius
     */
    public Sphere(double theRadius) {
        radius = theRadius;
    }

    /**
     * Compute and return the surface area of a sphere, using the formula
     *                      2                                
     * surface area = 4 Pi r
     *
     * @return the surface area
     */
    public double surfaceArea() {
        double area;		// the surface area

        area = 4 * Math.PI * radius * radius;

        return area;
    }

    /**
     * Compute and return the volume of a sphere, using the formula
     *                  3                                
     * volume = 4/3 Pi r
     *
     * @return the volume
     */
    public double volume() {
        double volume;

        volume = 4.0/3.0 * Math.PI * radius * radius * radius;

        return volume;
    }

    /**
     * Accessor method to return the radius of a sphere.
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
}

public class SphereTester {

    public static void main(String[] args) {
        // create sphere obj with radius of 4.5 units
        Sphere shakes = new Sphere(4.5);

        // get surface area and volume

        double surfaceArea = shakes.surfaceArea();
        double volume = shakes.volume();

        String out = "Radius = " + shakes.getRadius()
                + "\nSurface Area = " + surfaceArea
                + "\nVolume = " + volume + "\n";
        System.out.println(out);
    }
}