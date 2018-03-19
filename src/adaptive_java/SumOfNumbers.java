package adaptive_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( scanner.nextInt(87));

        //System.out.println(sum(0));
    }

    private static int sum(int sum) {
        int current = new Scanner(System.in).nextInt();
        Scanner scanner = new Scanner(System.in);
        return current == 0 ? sum : sum(sum + current);
    }
}
