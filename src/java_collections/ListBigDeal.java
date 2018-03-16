package java_collections;

import java.util.ArrayList;
import java.util.List;

public class ListBigDeal {
    public static void main(String[] args) {
        List<Integer> delList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            delList.add(i);
        }

        delList.removeIf(n -> n < 10);

        System.out.println(delList);
    }
}
