package com.belmont.prefile;

import java.util.*;
import java.io.*;

import static java.lang.Math.*;


public class prefile {
	
	public static boolean CHECKING_ON = false;
	private Scanner s;
	
	public prefile()
	{
		Fibonnacci fib = new Fibonnacci();
		try
		{
			s = new Scanner(new File("%.in"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		prefile it = new prefile();
		it.doWorkHere();
	}
	
	private void print(Object o)
	{
		System.out.print(o);
	}
	private void println(Object o)
	{
		System.out.println(o);
	}
	private void println()
	{
		System.out.println();
	}
	
	private void pErr(Object o)
	{
		if(CHECKING_ON)
			System.out.print(o);
	}
	private void plnErr(Object o)
	{
		if(CHECKING_ON)
			System.out.println(o);
	}
	private void plnErr()
	{
		if(CHECKING_ON)
			System.out.println();
	}
	private int c_i(char c)
	{
		return Character.getNumericValue(c);
	}
	
	private void doWorkHere()
	{
		print(pow(2,4));
		
	}
	
	public double[] midpoint(double x1, double x2, double y1, double y2)
    {
        double[] midpoint = new double[2];
        midpoint[0]= (x1+x2)/2;
        midpoint[1]=(y1 + y2)/2;
        return midpoint;
    }
	
	 public double saRectangularPrism(double length, double width, double height)
	    {
	        return 2*length*width + 2*width*height + 2*length*height;
	    }
	    
	    public double sacube(double length)
	    {
	        return 6*pow(length,2);
	    }
	    
	    public double saprism (double basePerimeter, double baseArea, double lengthLongSide)
	    {
	        return basePerimeter*lengthLongSide*2*baseArea;
	    }
	    
	    public double saSphere(double r)
	    {
	        return 4*PI*pow(r,2);
	    }
	    
	    public double saCylinder(double r, double height)
	    {
	        return 2*PI*pow(r,2)+2*Math.PI*r*height;
	    }
	    
	    public double volSphere(double r)
	    {
	        return Math.PI*Math.pow(r, 3)*4/3;
	    }
	    
	    public double volRectangluarPrism(double length, double width, double height)
	    {
	        return length * width * height;
	    }
	    
	    public double volIrregularPrism(double areaBase,double height)
	    {
	        return areaBase*height;
	    }
	    
	    public double volCylinder(double r, double height)
	    {
	        return Math.PI*Math.pow(r,2)*height;
	    }
	    
	    public double volPyramid(double length, double width,double height)
	    {
	        return length*width*height;
	    }
	    
	    public double volCone(double r, double height)
	    {
	        return Math.PI*Math.pow(r,2)*height/3;
	    }
	
	
}

