package DAY6.HW3;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> hm = new HashMap<>();

        hm.put(101, "Apple");
        hm.put(102, "Strawberry");
        hm.put(103, "Pineapple");
        hm.put(104, "Orange");

        System.out.println("Size of HashMap: " + hm.size());

        hm.remove(102);

        System.out.println("Value for key 104: " + hm.get(104));

        System.out.println("All Keys: " + hm.keySet());

        System.out.println("All Values: " + hm.values());

        System.out.println("All Entries: " + hm.entrySet());

        System.out.println("\nUsing for-each loop:");
        for (int key : hm.keySet()) {
            System.out.println(key + " -> " + hm.get(key));
        }

        System.out.println("\nUsing Iterator:");
        Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> pair = it.next();
            System.out.println(pair.getKey() + " -> " + pair.getValue());
        }
    }
}
