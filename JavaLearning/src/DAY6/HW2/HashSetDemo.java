package DAY6.HW2;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Banana");
        hs.add("Strawberry");
        hs.add("Apple");

        System.out.println("Size of HashSet: " + hs.size());

        hs.remove("Banana");
        System.out.println("After removing 'Banana': " + hs);

        Set<String> fruits = new HashSet<>();
        fruits.add("Blueberry");
        fruits.add("Pineapple");
        hs.addAll(fruits);
        System.out.println("After adding another set: " + hs);

        List<String> list = new ArrayList<>(hs);
        System.out.println("Accessing element at index 2: " + list.get(2));

        System.out.println("\nUsing for-each loop:");
        for (String temp : hs) {
            System.out.println(temp);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        hs.clear();
        System.out.println("\nAfter clear(): " + hs);

        System.out.println("Is HashSet empty? " + hs.isEmpty());
    }
}
