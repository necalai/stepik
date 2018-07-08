package adaptive_java;

import java.util.Scanner;

public class SquirrelsAndNutsTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrels = scanner.nextInt();
        int nuts = scanner.nextInt();

        System.out.println(nuts % squirrels);
    }
}
