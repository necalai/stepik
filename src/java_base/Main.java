package java_base;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(0);
        set2.add(1);
        set2.add(2);

        System.out.println(symmetricDifference(set1, set2));
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        HashSet<T> s1 = new HashSet<>(set1);
        HashSet<T> s2 = new HashSet<>(set2);
        HashSet<T> set = new HashSet<>(s1);

        set.addAll(new HashSet<>(s2));
        s1.retainAll(s2);
        set.removeAll(s1);

        return set;
    }
}
