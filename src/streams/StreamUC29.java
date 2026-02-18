package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUC29 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(15, 3, 9, 1, 20, 7);

        // Sort in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Sorted (Ascending): " + sortedNumbers);
    }
}
