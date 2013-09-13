import java.util.Scanner;
import java.util.ArrayList;
/**
 * The Gorrelians have crashed.  Each Gorrelian has a radio with a limited range. If the radio's range reaches another Gorrelian
 * they meet, the radio can reach sqrt((C1 + C2)/(Pi)), which boils down to sqrt((rng1^2 + rng2^2)). Input is a string with number
 * of Gorrelians on line one.
 * 
 * @author Max Shenfield
 * @version 09/12/2013
 */
public class crash
{
    ArrayList<gorelian> stranded;
    Scanner scan;
    int leng;
    /**
     * Constructor for objects of class crash
     */
    public crash()
    {
       scan = new Scanner(System.in);
       leng = scan.nextInt();
       stranded = new ArrayList<gorelian>(leng);
    }

    /**
     * Simulates the merging of nearby gorelians outlined in the crash_and_go problem.
     * 
     */
    public void main()
    {   
        boolean settle = false;
        double distance = 0;
        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;
        double r1 = 0;
        double r2 = 0;
        gorelian g1;
        gorelian g2;
        for(int i = 0; i<leng; i++)
        {
            stranded.add(i, new gorelian(scan.nextInt(), scan.nextInt(),scan.nextInt()));
        }
        while(!settle)
        {
            settle = true;
            for(int i=0; i<leng; i++)
            {    
               g1 = stranded.get(i);
               for(int j=i+1; j<leng; j++)
               {
                   g2 = stranded.get(j);
                   x1 =  g1.getX();
                   x2 = g2.getX();
                   y1 = g1.getY();
                   y2 =  g2.getY(); 
                   r1 = g1.getR();
                   r2= g2.getR();
                   distance = Math.sqrt( Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
                   if(distance <= r1 || distance <= r2)
                   {
                       g1.setR(combineRange(g1.getR(), g2.getR()));
                       g1.setX((x1+x2)/2);
                       g1.setY((y1+y2)/2);
                       delete(j);
                       j = i;
                       settle = false;
                       leng = stranded.size();
                   }
               }            
            }
        }
        System.out.println(stranded.size());
    }
    
    public void delete(int i)
    {
       int index;
       for(index = i; index < stranded.size() - 1; index ++)
       {
           stranded.set(index, stranded.get(index + 1));
       }
       stranded.remove(stranded.size()-1);
       stranded.trimToSize();
    }
    
    public double combineRange(double radius1, double radius2)
    {
        return Math.sqrt(Math.pow(radius1, 2) + Math.pow(radius2, 2));
    }   
    
}
