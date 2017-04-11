package learn_by_implementing.sequential_list;

import learn_by_implementing.sequential_list.arrayList.SeqArrayList;

import java.util.Random;

/**
 * Created by Gaurav on 11/04/17.
 */
public class SequentialListTest {

    public static void main(String arg[])
    {
        ISequentialList list = new SeqArrayList();
        list.add(5);
        System.out.println(list.size());
        System.out.println("check for two "+list.contains(2));
        Random random = new Random();
        for(int i = 0;i<5;++i)
        {
            list.add(random.nextInt(10)+1);
        }
        list.display();
        System.out.println("list size "+list.size());
        list.add(2,120);

        System.out.println("list size "+list.size());
        list.removeAt(3);

        System.out.println("list size after removal "+list.size());
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        int item = list.get(2);
        list.remove(item);

        System.out.println("list size after removal of "+item+" is "+list.size());
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
