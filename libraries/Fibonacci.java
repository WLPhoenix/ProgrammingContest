import java.util.ArrayList;

/**
 * Write a description of class Fibonnaci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonnaci
{
    private ArrayList<Integer> num;

    /**
     * Constructor for objects of class Fibonnaci
     */
    public Fibonnaci()
    {
        num = new ArrayList<Integer>();
    }

    /**
     * Recursive method to calculate the nth digit of the fibonacci series.
     */
    public int fib(int n)
    {
        int j,k;

        if(n <2)
            return 1;

        j = fib(n-1);
        k = fib(n-2);
        return j+k;
    }

    /**
     * List of n fibonnaci numbers
     * 
     */
    public void fibList(int n)
    {
        if(n < 1)
        {   num.add(0,1);
            return;
        }
        else if (n == 2){
            num.add(0,1);
            num.add(1,1);
        }
        else{
            num.add(0,1);
            num.add(1,1);
            for(int i = 2; i -1 < n; i++)
            {
                int j = num.get(i-2) + num.get(i-1);
                num.add(i, j);
            }
        }
    }
}
