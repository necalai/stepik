package java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsConverting {
//    public static void main(String[] args) {
//        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
//
//        String[] strArray = nameList.stream().toArray(String[]::new);
//
//        for (int i = 0; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
//        }
//    }

    public static void main(String[] args) {

        List<GreekLetter> letterList = new ArrayList<>();
        letterList.add(new GreekLetter("Gamma",  3));
        letterList.add(new GreekLetter("Omega", 24));
        letterList.add(new GreekLetter("Alpha",  1));


        Object[] objArray = letterList.toArray();


        for (int i = 0; i < objArray.length; i++) {
            System.out.println(objArray[i]);
        }
    }

    static class GreekLetter {

        private String letter;
        private Integer position;

        public GreekLetter(String letter, Integer position) {
            this.letter = letter;
            this.position = position;
        }

        @Override
        public String toString() {
            return "{" +
                    "letter='" + letter + '\'' +
                    ", position=" + position +
                    '}';
        }
    }
}
