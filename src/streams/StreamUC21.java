package streams;

import java.util.Arrays;
import java.util.List;

public class StreamUC21 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);

        // UC 2.1 - Create stream and iterate
        numbers.stream()
                .forEach(System.out::println);
    }
}