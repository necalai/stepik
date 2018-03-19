package adaptive_java;

import java.util.Scanner;

public class ReplacesSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        System.out.println(line.replaceAll("[ ]+", "_"));
    }
}
