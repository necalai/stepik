package adaptive_java;

import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        char c = new Scanner(System.in).next().charAt(0);

        if (String.valueOf(c).matches("[A-Za-z]")) {
            c = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        }

        System.out.println(c);
    }
}
