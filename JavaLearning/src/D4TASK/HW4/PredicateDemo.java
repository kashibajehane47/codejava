package D4TASK.HW4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> greaterThan20 = num -> num > 20;

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 56, 55);

        System.out.println("All even numbers:");
        filterNumbers(isEven, list);

        System.out.println("\nNumbers greater than 20:");
        filterNumbers(greaterThan20, list);

        System.out.println("\nNumbers that are even AND greater than 20:");
        filterNumbers(isEven.and(greaterThan20), list);

        System.out.println("\nNumbers that are even OR greater than 20:");
        filterNumbers(isEven.or(greaterThan20), list);

        System.out.println("\nOdd numbers:");
        filterNumbers(isEven.negate(), list);
    }

    public static void filterNumbers(Predicate<Integer> predicate, List<Integer> list) {
        for (int value : list) {
            if (predicate.test(value)) {
                System.out.println(value);
            }
        }
    }

}
