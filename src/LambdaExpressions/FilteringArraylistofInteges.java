package LambdaExpressions;

import java.util.ArrayList;

public class FilteringArraylistofInteges {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Use lambda expression to filter out even numbers
        numbers.removeIf(number -> number % 2 == 0);

        // Print the remaining odd numbers
        System.out.println("Odd numbers:");
        numbers.forEach(number -> System.out.println(number));
    }




}
