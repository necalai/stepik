package adaptive_java;

import java.util.Scanner;

public class OneHundredYearsOld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nameOld = scanner.nextLine().split(" ");
        final int CURRENT_YEAR = 2016;

        System.out.println(nameOld[0] + ", You will be 100 years old in "
                + (CURRENT_YEAR + 100 - Integer.parseInt(nameOld[1])) + " year.");
    }
}
