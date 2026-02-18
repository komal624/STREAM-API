package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUC23 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Transform and store into new List using collect
        List<Integer> resultList = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Collected List: " + resultList);
    }
}
