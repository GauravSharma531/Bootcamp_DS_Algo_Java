import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Gaurav on 23/03/17.
 */
public class FindCommonElements {


    public int findCommonElements1(int[] in1,int[] in2)
    {
        /**
         * compare each element of both arrays and return the results
         */
        int commonElements = 0;
        for(int i=0;i<in1.length;i++)
        {
            for(int j=0;j<in2.length;j++)
            {
                if(in1[i]==in2[j])
                    ++commonElements;
            }
        }
        System.out.println("in1 "+ Arrays.toString(in1));
        System.out.println("in2 "+Arrays.toString(in2));
        System.out.println("common element between in1 and in2 "+commonElements);
        return commonElements;
    }

    public int findCommonElements2(int[] in1,int[] in2)
    {
        /**
         * Using Data Structure insert item into set since set can keep only unique values
         */
        int commonElements = 0;
        Set<Integer> uniqueElements = new HashSet<>();
        for(int i=0;i<in1.length;i++)
        {
            uniqueElements.add(in1[i]);
        }
        for(int j=0;j<in2.length;j++)
        {
            boolean isAdded = uniqueElements.add(in2[j]);
            if(!isAdded)
            {
                System.out.println("not added "+ in2[j]);
                ++commonElements ;
            }
        }

        System.out.println("in1 "+ Arrays.toString(in1));
        System.out.println("in2 "+Arrays.toString(in2));
        System.out.println("common element between in1 and in2 "+commonElements);
        return commonElements;
    }

    public int findCommonElements3(int[] in1,int[] in2)
    {
        /**
         * Short one array then traverse another array and search for element of second array in first array.
         */
        int commonElements = 0;
        Arrays.sort(in1);
        for(int i=0;i<in1.length;i++)
        {
            if(Arrays.binarySearch(in1,in2[i]) >=0)
                commonElements++;
        }
        System.out.println("in1 "+ Arrays.toString(in1));
        System.out.println("in2 "+Arrays.toString(in2));
        System.out.println("common element between in1 and in2 "+commonElements);
        return commonElements;
    }

    public int findCommonElements4(int[] in1,int[] in2)
    {
        /**
         * Short both array and check on index basis
         */
        int commonElements = 0;
        Arrays.sort(in1);
        Arrays.sort(in2);
        int i = 0, j = 0;
        //<= 2n
        /**
         * x< y increase i
         * x > y increase j
         * x == y increase i and j where x is first array element and y is second arrays element
         */
        while (i < in1.length && j < in2.length) {
            if (in1[i] < in2[j])
                ++i;
            else if (in1[i] > in2[j])
                ++j;
            else {
                ++i;
                ++j;
                ++commonElements;
            }
        }
        System.out.println("in1 "+ Arrays.toString(in1));
        System.out.println("in2 "+Arrays.toString(in2));
        System.out.println("common element between in1 and in2 "+commonElements);
        return commonElements;
    }
}
