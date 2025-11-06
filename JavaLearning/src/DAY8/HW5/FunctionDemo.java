package DAY8.HW5;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        // Function to return length of a string
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of string: " + stringLength.apply("Hello World!"));

        // Function to convert String to uppercase
        Function<String, String> toUpper = s -> s.toUpperCase();
        System.out.println("Uppercase: " + toUpper.apply("kashiba jehane"));

        // Function to square a number
        Function<Integer, Integer> square = n -> n * n;
        System.out.println("Square of 6: " + square.apply(6));
    }
}
