import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {// instance variables - replace the example below with your own
    //int number;
    Random random=new Random();
    Scanner sc=new Scanner(System.in);
    int number=random.nextInt(100);
    int guess=-1;
    int count=0;
    
    while(guess!=number)
    {
        System.out.println("Enter your guess:");
        guess=sc.nextInt();
        count=count+1;
        if(guess<number)
        {
            System.out.println("Too small number");
        }
        else if(guess>number)
        {
            System.out.println("Too large number");
        }
        else
        {
    
    System.out.println("Correct number!! and number of guesses:"+ count);
}
}
}

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        //int x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return 0;
    }
}
