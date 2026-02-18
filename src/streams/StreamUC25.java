package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamUC25 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(7, 9, 11, 14, 18);

        // UC 2.5 - Find first even number
        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        if (firstEven.isPresent()) {
            System.out.println("First Even Number: " + firstEven.get());
        } else {
            System.out.println("No Even Number Found");
        }
    }
}
