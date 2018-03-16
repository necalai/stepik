package java_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsCreating {
    public static void main(String[] args) {
        Set set = new TreeSet(Arrays.asList("Gamma", "Alpha", "Omega"));

        System.out.println(set);
    }
}
