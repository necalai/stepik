package java_collections;

import sun.misc.IOUtils;

import java.util.*;
import java.util.stream.Stream;

public class MapsBypassing {
    public static void main(String[] args) {
//        Map<String, Integer> map = new TreeMap<>();
//        map.put("Gamma", 3);
//        map.put("Omega", 24);
//        map.put("Alpha", 1);
//
//        System.out.println(map.entrySet());


//        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
//
//        queue.add(5);
//
//        System.out.println(Arrays.asList(queue.stream().skip(2).toArray()));


        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Omega", 24);
        map.put("Alpha", 1);
        map.put("Gamma", 3);

        System.out.println(map);

    }
}
