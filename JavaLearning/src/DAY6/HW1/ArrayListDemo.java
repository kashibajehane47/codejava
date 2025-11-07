package DAY6.HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();
        list.add("Jehane");
        list.add(20);
        list.add('F');
        list.add(356.123);
        list.add(true);
        list.add("Jehane");
        list.add(null);
        System.out.println("Initial List: " + list);

        list.set(4, false);

        list.add(3, "hashi");

        System.out.println("After Insert & Update: " + list);

        System.out.println("Element at index 5: " + list.get(5));

        list.clear();
        System.out.println("After clear(): " + list);
        System.out.println("Is Empty? " + list.isEmpty());

        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(array));
        System.out.println("Array converted to ArrayList: " + list1);

        System.out.println("\nUsing for loop:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("\nUsing for-each loop:");
        for (Integer temp : list1) {
            System.out.println(temp);
        }
        System.out.println("\nUsing Iterator:");
        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
