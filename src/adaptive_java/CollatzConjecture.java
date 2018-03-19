package adaptive_java;

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        System.out.print(n);

        while (n != 1) {
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            System.out.print(" " + n);
        }
    }
}
