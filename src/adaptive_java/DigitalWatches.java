package adaptive_java;

import java.util.Scanner;

public class DigitalWatches {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        String ss = (n % 60 < 10) ? ("0" + (n % 60)) : String.valueOf(n % 60);
        String mm = (n / 60 % 60 < 10) ? "0" + (n / 60 % 60) : String.valueOf(n / 60 % 60);
        String h = String.valueOf(n / 60 / 60 % 24);

        System.out.printf("%s:%s:%s", h, mm, ss);
    }
}
