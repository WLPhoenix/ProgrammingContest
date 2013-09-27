package com.belmont.prefile;

/**
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Distance
{

    /**
     * Constructor for objects of class Distance
     */
    public Distance()
    {
    }

    public double betweenPoints(double x1, double x2, double y1, double y2)
    {
        return Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
}
