/**
* The gorelian class has xy coordinates and a radius representing the distance a radio can communicate
* Setter and getter methods for these properties.
*
* @author Max Shenfield
* @version 09/12/2013
*/
public class gorelian
{
    double xcoord;
    double ycoord;
    double radius;
    /**
* Constructor for objects of class gorelian
*/
    public gorelian(int x, int y, int r)
    {
       xcoord = x;
       ycoord = y;
       radius = r;
    }

    /**
* An example of a method - replace this comment with your own
*
* @param y a sample parameter for a method
* @return the sum of x and y
*/
    public double getX()
    {
        return xcoord;
    }
    
    public double getY()
    {
        return ycoord;
    }
    
    public double getR()
    {
        return radius;
    }
    
     public void setX(double x)
    {
        xcoord = x;
    }
    
    public void setY(double y)
    {
        ycoord = y;
    }
    
    public void setR(double r)
    {
        radius = r;
    }
    
    
}
