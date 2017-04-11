package learn_by_implementing.sequential_list;

/**
 * Created by Gaurav on 08/04/17.
 */
public interface ISequentialList {

    int get(int index);
    void add(int index, int element);
    void add(int element);
    boolean contains(int element);
    int size();
    void remove(int element);
    void removeAt(int index);
    int sort();
    void display();


}
