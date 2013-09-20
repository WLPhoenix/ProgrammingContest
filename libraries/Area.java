
/**
 * Holds formulas for the area of geometric shapes
 * 
 * @author Max Shenfield
 * @version 09/19/2013
 */
public class Area
{
    /**
     * Constructor for objects of class Area
     */
    public Area()
    {
    }


    public double circle(double r)
    {
        return Math.PI*Math.pow(r, 2);
    }
    
    /**
     * R1 is the length of semi-minor axis, R2 is length of semi-major axis
     * A semi axis is half the axis
     */
    public double ellipse(double r1, double r2)
    {
        return Math.PI * r1 * r2;
    }

    public double parallelogram(double base, double height)
    {
        return base * height;
    }
    
    public double triangle(double base, double height)
    {
        return base * height/2;
    }
    
    /**
     * A trapezoid is a four sided figure with two sides parralel of different length
     */
    public double trapezoid(double height, double base1, double base2)
    {
        return height/(2*(base1 + base2));
    }
}
