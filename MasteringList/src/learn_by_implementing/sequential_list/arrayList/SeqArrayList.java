package learn_by_implementing.sequential_list.arrayList;

import learn_by_implementing.sequential_list.ISequentialList;

import java.util.Arrays;

/**
 * Created by Gaurav on 08/04/17.
 */
public class SeqArrayList implements ISequentialList{

    private int[] elements;
    private int size;
    private int capacity;

    public SeqArrayList()
    {
        this(5);
    }

    public SeqArrayList(int initialSize)
    {
        capacity = initialSize;
        elements = new int[initialSize];
    }

    @Override
    public int get(int index) {
        return elements[index];
    }

    @Override
    public void add(int index, int element) {
        if(size < capacity - 1)
        {
            shuffleItems(index,element);
        }
        else
        {
            createNewList();
            shuffleItems(index,element);
        }
    }

    private void shuffleItems(int index, int element)
    {
        int[] temp = new int[capacity];
        for(int i=0 ; i<=size;i++)
        {
            if(i==index)
            {
                temp[i] = element;
            }
            else if(i<index)
            {
                temp[i] = elements[i];
            }
            else
            {
                temp[i] = elements[i-1];
            }
            System.out.print(temp[i] +" ,");;

        }
        ++size;
        elements = temp;
        System.out.println();
    }

    @Override
    public void display()
    {
        System.out.println(Arrays.toString(elements));
    }

    @Override
    public void add(int element) {
        if(size < capacity -1)
        {
            elements[size] = element;
        }
        else
        {
            createNewList();
            elements[size] = element;
        }
        ++size;


    }

    private void createNewList()
    {
        capacity = capacity*2;
        int[] temp =  new int[capacity];
        for(int i = 0;i<size;i++)
        {
            temp[i] = elements[i];
        }
        elements = temp;
        temp = null;
    }

    @Override
    public boolean contains(int element) {
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void remove(int element) {
        int temp[] = new int[size];
        boolean deleted = false;
        for(int i=0;i<size;i++)
        {
            if(deleted)
                temp[i] = elements[i+1];
            else
            {
                if(elements[i] == element)
                {
                    deleted = true;
                    temp[i] = elements[i+1];
                }
                else
                    temp[i] = elements[i];

            }

        }
        elements = temp;
        --size;

    }

    @Override
    public void removeAt(int index) {
        int temp[] = new int[size];
        for(int i =0;i<size;i++)
        {
            if(i>=index)
                temp[i]=elements[i+1];
            else
            {
                temp[i]=elements[i];
            }

        }
        elements = temp;
        --size;
    }

    @Override
    public int sort() {
        return 0;
    }
}
