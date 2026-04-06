package collection;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalProgramming {

    public static void main(String[] args) {

        // Functional interface
        // Rule: must have only one abstract method @FunctionalInterface


        List<Integer> list = Arrays.asList(11, 2, 3, 4, 5);
//        Comparator<Integer> comparator = new IntComparator();
//
//        list.sort(comparator);
        Comparator<Integer> integerComparator;

        // remove public int compare
        integerComparator = (Integer p1, Integer p2) -> {
            if (p1 < p2) {
                return -1;
            } else if (p1 == p2) {
                return 0;
            } else {
                return 1;
            }
        };

        // parameter type also ignored
        integerComparator = (p1, p2) -> {
            return Integer.compare(p1, p2);
        };

        integerComparator = (p1, p2) -> Integer.compare(p1, p2);

        System.out.println(list);

        list.sort(integerComparator);

        System.out.println(list);

        Comparator<User> userComparator;
        userComparator = (u1, u2) -> u1.name.compareTo(u2.name);

        // Predicate, Function, Supplier and Consumer
//        Predicate

        for (Integer i : list) {
            if (isEven(i))
                System.out.println("Even: " + i);
        }

        var result = list.stream()
                .filter(element -> isEven(element)) // filter(x -> x % 2 == 0)
                .toList();
        System.out.println(result);

        System.out.println(list.stream()
                .anyMatch(x -> x % 2 == 0));

        System.out.println(list.stream()
                .anyMatch(x -> x > 10));


        List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
//        stooges.add("alkmf");
        stooges.set(0, "sdf");
        System.out.println(stooges);


        var vale2 = List.of(1, 2);
//        vale2.add(3);
//        vale2.set(1,22);

        ArrayList<Object> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        var vale = Collections.unmodifiableList(list1);
//        vale.set(1, 22);
//        vale.add(2);

    }

    static boolean isEven(int no) {
        return no % 2 == 0;
    }

}

class IntComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) { // remove public int compare, if the logic is one-liner optional {}, return
        return Integer.compare(o1, o2);
    }
}
