package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamUC26 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 8, 12, 5, 20, 7);

        // Filter even numbers
        Optional<Integer> minEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .min(Comparator.naturalOrder());

        Optional<Integer> maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Comparator.naturalOrder());

        minEven.ifPresent(value -> System.out.println("Min Even: " + value));
        maxEven.ifPresent(value -> System.out.println("Max Even: " + value));
    }
}
