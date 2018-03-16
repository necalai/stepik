package java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsBypassing {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

        nameList.stream().forEach(System.out::println);

        System.out.println("Mr.Green\nMr.Yellow\nMr.Red");
    }
}
