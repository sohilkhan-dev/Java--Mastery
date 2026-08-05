package collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Get element
        System.out.println(numbers.get(0));

        // Change element
        numbers.set(1, 50);

        // Remove element
        numbers.remove(2);

        // Size
        System.out.println(numbers.size());

        // Print all elements
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}