package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamUC27 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 8, 12, 16, 20);

        // Sum of numbers
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        // Average of numbers
        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("Sum: " + sum);

        if (average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        }
    }
}
