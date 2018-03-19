package adaptive_java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class GradesTwo {
    public static void main(String[] args) {
        String[] grades = new Scanner(System.in).nextLine().split(" ");

        System.out.println(Arrays.stream(grades).filter(s -> s.equals("A")).count() / (double) grades.length);
    }
}
