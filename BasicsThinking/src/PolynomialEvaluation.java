import java.util.Arrays;
import java.util.Random;

/**
 * Created by Gaurav on 31/03/17.
 */
public class PolynomialEvaluation {

    /**
     * Given a real number x, and a sequence of real numbers c0,c1....cn. Write an efficient program to find the out the value of
     * following polynomial of degree 'n'.
     * p^n (x) = Cn x^n + Cn-1 x^n-1 + ......+ c0
     *
     */

    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        System.out.println(evaluatePolynomialEquation(n));
    }



    private static int evaluatePolynomialEquation(int n) {
        int[] constants = generateConstantArray(n);
        System.out.println(Arrays.toString(constants));
        int x = 2;
        System.out.println("value of x :"+ x);
        int polynomialValue = 0;
        for(int i=0;i<n;++i)
        {
            polynomialValue += constants[i] * evaluatePower(x,i+1);
        }

        return polynomialValue;
    }

    private static int[] generateConstantArray(int n)
    {
        int[] constantSequence = new int[n];
        Random r = new Random();
        for(int i= 0;i<n;i++)
            constantSequence[i] = (r.nextInt(n)+1) *5;
        return constantSequence;
    }

    private static int evaluatePower(int x, int power)
    {
        int value = 0;
        if(power==0) return 1;
        else
           value =  x * evaluatePower(x,--power);
        return value;
    }
}
