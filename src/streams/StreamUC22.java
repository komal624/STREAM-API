package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUC22 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);

        // UC 2.2 - Transform each element to double
        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Doubled List: " + doubledNumbers);
    }
}