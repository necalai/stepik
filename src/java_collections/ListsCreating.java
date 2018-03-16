package java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsCreating {
    public static void main(String[] args) {
//        List list = new ArrayList(Arrays.asList(2, 0, 1, 7));
//
//        System.out.println(list);

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 2));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.equals(list2));
    }
}
