package adaptive_java;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOfOddNumbersInRange(7, 9));
    }

    public static long sumOfOddNumbersInRange(long start, long end) {
        return LongStream.range(start, ++end).filter(l -> l % 2 != 0).sum();
    }
}
