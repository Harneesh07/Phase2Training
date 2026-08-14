import java.util.ArrayList;
import java.util.List;



public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("ArrayList: " + list);

        list.remove(1);
        System.out.println("After removing element at index 1: " + list);

        int size = list.size();
        System.out.println("Size of ArrayList: " + size);

        boolean contains20 = list.contains(20);
        System.out.println("Contains 20? " + contains20);

        int index = list.indexOf(30);
        System.out.println("Index of 30: " + index);

        list.clear();
        System.out.println("After clearing the ArrayList: " + list);
    }

}
