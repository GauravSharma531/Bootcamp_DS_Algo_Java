import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Gaurav on 23/03/17.
 */
public class FindCommonElementsTest {

    public static void main(String args[])
    {
        FindCommonElements findCommonElements = new FindCommonElements();
        int arraySize = Integer.parseInt(args[0]);
        int[] in1 = generateArray(arraySize);
        int[] in2 = generateArray(arraySize);
        findCommonElements.findCommonElements1(in1,in2);
        findCommonElements.findCommonElements2(in1,in2);
    }

    private static int[] generateArray(int size)
    {
        Set<Integer> s = new HashSet<>();
        Random random = new Random();
        int[] tempArray = new int[size];
        int index = 0 ;
        while(s.size() != size){
            int tempInt = 1 + (int) random.nextInt(size*100);
            boolean isAdded = s.add(tempInt);
            if(isAdded)
            {
                tempArray[index] = tempInt;
                ++index;
            }
        }

        return tempArray;
    }
}
