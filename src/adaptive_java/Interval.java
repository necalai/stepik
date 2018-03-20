package adaptive_java;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        String answer = String.valueOf(n > -15 && n <= 12 || n > 14 && n < 17 || n >= 19);

//        System.out.println(StringUtils
//                .capitalize(
//                        String.valueOf(n > -15 && n <= 12 || n > 14 && n < 17 || n >= 19)
//                ));

        System.out.println(answer.substring(0, 1).toUpperCase().concat(answer.substring(1)));


    }
}
