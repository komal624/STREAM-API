package streams;

import java.util.Arrays;
import java.util.List;

public class StreamUC28 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 9);

        // Check if all numbers are even
        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);

        // Check if at least one number is even
        boolean anyEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        // Check if no number is even
        boolean noneEven = numbers.stream()
                .noneMatch(n -> n % 2 == 0);

        System.out.println("All Even: " + allEven);
        System.out.println("Any Even: " + anyEven);
        System.out.println("None Even: " + noneEven);
    }
}
