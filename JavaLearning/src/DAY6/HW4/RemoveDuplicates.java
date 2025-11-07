package DAY6.HW4;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Orange", "Banana", "Apple", "Orange", "Banana", "Pineapple"};

        Set<String> uniqueFruits = new HashSet<>();

        for (String fruit : fruits) {
            uniqueFruits.add(fruit);
        }

        System.out.println("Unique Fruits: " + uniqueFruits);
    }
}
