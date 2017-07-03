
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{

    /**
     * Constructor for objects of class Test
     */
    public static void main(int first, int second)
    {
        Number sample;
        sample = new Number();

        System.out.println("Number of prime numbers between 10,000 and 20,000" +
            " using the Prime Number Theorem");
        System.out.println(sample.primeBetweenPNT(10000,20000));
        System.out.println("Number of prime numbers between 10,000 and 20,000" +
            " using the our own algorithm");
        System.out.println(sample.primeBetween(10000,20000));
        System.out.println("These two numbers are close, but we can use the prime " +
            "number theorem for bigger numbers.");

        System.out.println("Number of prime numbers between " + first + " and "+ second);
        System.out.println(sample.primeBetweenPNT(first,second));
        System.out.println("\n");
        sample.randPrime(first,second);
    }

}
