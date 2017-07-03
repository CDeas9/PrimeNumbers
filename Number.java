import java.util.Random;
import java.util.ArrayList;
/**
 * PrimeNumbers was created as a discrete math project. We had to use the prime number
 * theorem to find the amount of prime numbers between 1,000,000,000 and 2,000,000,000. 
 * We then had to find 25 prime numbers inbetween them.
 * 
 * Prime Number Theorem came from http://mathworld.wolfram.com/PrimeNumberTheorem.html
 * 
 * @author Callie Deas 
 * @version 4-21-17
 */
public class Number
{
    private Random gen;
    private ArrayList<Integer> primeNumsCnt;
    private ArrayList<Integer> primeNums;
    /**
     * Constructor for objects of class Number
     */
    public Number()
    {
        gen = new Random();
        primeNumsCnt = new ArrayList<Integer>();
        primeNums = new ArrayList<Integer>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  num   a number to be tested whether it is prime or not
     * @return     true if it is prime and false if it is composite 
     */
    public boolean isPrime(int num)
    {
        if(num%2 == 0)return false;
        for(int i = 0; i< primeNums.size(); i++){
            if(num%primeNums.get(i) == 0) return false;
        }
        for(int i=3;i<Math.sqrt(num);i++) {
            if(num%i==0) return false;
        }

        return true;

    }

    public double primeBetweenPNT(double first, double second)
    {
        double b = -1.08366;
        double two = second/(Math.log(second)+ b);
        double one = first/(Math.log(first)+b);
        return (int)(two-one);
    }

    public double primeBetween(int first, int second)
    {
        int numOfPrime = 0;

        for(int i = first; i< second; i++) {
            if(isPrime(i)){
                numOfPrime++;
                primeNumsCnt.add(i);
            }
        }
        return numOfPrime;
    }

    public void randPrime(int first, int second){
        while(primeNums.size() < 25) {
            int num = gen.nextInt(second-first+1) + first;
            if(isPrime(num)){
                primeNums.add(num);
            }
        }
        for(int i = 0; i< primeNums.size(); i++){
            System.out.println(primeNums.get(i));
        }

    }
}
