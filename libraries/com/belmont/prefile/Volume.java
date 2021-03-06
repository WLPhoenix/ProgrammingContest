package com.belmont.prefile;

/**
 * Provides methods for computing the volume of common 3-dimensional shapes.
 * 
 * @author Sora Chung, Max Shenfield
 * @version 09/19/2013
 */
public class Volume
{
    /**
     * Constructor for objects of class Volume
     */
    public Volume()
    {
    }

    public double sphere(double r)
    {
        return Math.PI*Math.pow(r, 3)*4/3;
    }
    
    public double rectangluarPrism(double length, double width, double height)
    {
        return length * width * height;
    }
    
    public double irregularPrism(double areaBase,double height)
    {
        return areaBase*height;
    }
    
    public double cylinder(double r, double height)
    {
        return Math.PI*Math.pow(r,2)*height;
    }
    
    public double pyramid(double length, double width,double height)
    {
        return length*width*height;
    }
    
    public double cone(double r, double height)
    {
        return Math.PI*Math.pow(r,2)*height/3;
    }
	public static void main(String[] args) 
	{
	}
}
