package adaptive_java;

import java.util.Scanner;

public class LengthOfTheSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 0;
        while (n != 0) {
            ++counter;
            n = scanner.nextInt();
        }

        System.out.println(counter);
    }
}
