import java.util.LinkedList;


public class LinkedListDemo {
    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("LinkedList: " + list);

        list.addFirst(5);
        list.addLast(50);
        System.out.println("After addFirst & addLast: " + list);

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        list.remove(1);
        list.remove(Integer.valueOf(30));
        list.removeFirst();
        list.removeLast();

        System.out.println("After removals: " + list);

        System.out.println("Size: " + list.size());

        System.out.println("Contains 20? " + list.contains(20));

        System.out.println("Index of 40: " + list.indexOf(40));


        list.clear();
        System.out.println("After clear: " + list);
        System.out.println("Is empty? " + list.isEmpty());
    }
}
