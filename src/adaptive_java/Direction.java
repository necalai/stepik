package adaptive_java;

import java.util.Scanner;

public class Direction {
    public static void main(String[] args) {
        switch (new Scanner(System.in).next()) {
            case "1":
                System.out.println("move up");
                break;
            case "2":
                System.out.println("move down");
                break;
            case "3":
                System.out.println("move left");
                break;
            case "4":
                System.out.println("move right");
                break;
            case "5":
                System.out.println("do not move");
                break;
            default:
                System.out.println("error!");
        }
    }
}
