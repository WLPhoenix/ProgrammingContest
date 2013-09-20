
/**
 * Find SurfaceArea of common geometric shapes
 * 
 * @author Max Shenfield
 * @version 09/19/2013
 */
public class SurfaceArea
{
    /**
     * Constructor for objects of class SurfaceArea
     */
    public SurfaceArea()
    {

    }
    
    public double rectangularPrism(double length, double width, double height)
    {
        return 2*length*width + 2*width*height + 2*length*height;
    }
    
    public double cube(double length)
    {
        return 6*Math.pow(length,2);
    }
    
    public double prism (double basePerimeter, double baseArea, double lengthLongSide)
    {
        return basePerimeter*lengthLongSide*2*baseArea;
    }
    
    public double sphere(double r)
    {
        return 4*Math.PI*Math.pow(r,2);
    }
    
    public double cylinder(double r, double height)
    {
        return 2*Math.PI*Math.pow(r,2)+2*Math.PI*r*height;
    }
}
