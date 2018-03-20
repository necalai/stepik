package adaptive_java;

import java.util.Scanner;

public class SumOfAllElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = scanner.nextInt();

        while (n != 0) {
            sum += n;
            n = scanner.nextInt();
        }

        System.out.println(sum);
    }
}
