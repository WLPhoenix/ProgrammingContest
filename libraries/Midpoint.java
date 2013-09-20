
/**
 * Midpoint between two points
 * 
 * @author Max Shenfield
 * @version 09/19/2013
 */
public class Midpoint
{
    /**
     * Constructor for objects of class Midpoint
     */
    public Midpoint()
    {
    }
    
    public double[] midpoint(double x1, double x2, double y1, double y2)
    {
        double[] midpoint = new double[2];
        midpoint[0]= (x1+x2)/2;
        midpoint[1]=(y1 + y2)/2;
        return midpoint;
    }
}
