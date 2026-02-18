package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUC24 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 10, 13);

        // UC 2.4 - Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Even Numbers: " + evenNumbers);
    }
}
