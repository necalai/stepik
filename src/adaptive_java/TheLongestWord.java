package adaptive_java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TheLongestWord {
    public static void main(String[] args) {

        System.out.println(Arrays
                .stream(new Scanner(System.in).nextLine().split(" "))
                .max(Comparator.comparingInt(String::length))
                .get());
    }
}
