package adaptive_java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsInPracticeTheProductOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        long val = numbers.stream().collect(Collectors.reducing((Integer a, Integer b) -> a * b)).get();

        System.out.println(val);
    }
}
