import java.util.Arrays;
import java.util.Random;

/**
 * Created by Gaurav on 31/03/17.
 */
public class PolynomialEvaluation {

    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        System.out.println(eval(n));
    }

    private static int eval(int n) {
        int[] constans = generateConstantArray(n);
        System.out.println(Arrays.toString(constans));
        int x = 2;
        System.out.println("value of x :"+ x);
        int polynomialValue = 0;
        for(int i=0;i<n;++i)
        {
            polynomialValue += constans[i] * evaluatePower(x,i+1);
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
