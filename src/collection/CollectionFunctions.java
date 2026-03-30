package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionFunctions {


    public static void main(String[] args) {
        // imperative style
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> result = new ArrayList<>();

        for (Integer num : numbers) {
            if (num % 2 == 0) {        // filter
                result.add(num * num); // map
            }
        }

        System.out.println(result);

        // Declarative style
        List<Integer> numbersDeclarative = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> resultDeclarative =
                numbersDeclarative.stream() // sends every element to below function
                        .filter(num -> num % 2 == 0)  // filter sends only condition matching element below function
                        .map(num -> num * num)        // mapping every element got by squaring it
                        .toList();

        System.out.println(resultDeclarative);
    }


}
