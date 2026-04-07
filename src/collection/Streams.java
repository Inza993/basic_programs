package collection;

import java.util.*;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        // streams lazy
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");

        // vertical flow
        list.stream()
                .filter(s -> { // intermediate functions are lazy only execute on terminal function calls
                    System.out.println("filter: " + s);
                    return s.contains("d");
                })
                .forEach(s -> {
                    System.out.println("foreach: " + s);
                });

        System.out.println("end");

        Stream<String> stream = list.stream()
                .filter(element -> {
                    System.out.println("element: " + element);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return element.contains("d");
                });

        stream.toList();

        List<String> lst = Arrays.asList("abc1", "abc2", "abc3");

        lst.stream()
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.contains("2");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s;
                })
                .findFirst();


        // stream is not reusable
        Stream<String> streamOf2 = lst.stream()
                                    .filter(s -> {
                                        System.out.println("filter: " + s);
                                        return s.contains("2");
                                    });

        System.out.println("stream.findFirst(): "+streamOf2.findFirst());
//        System.out.println("stream.toList(): "+streamOf2.toList());


        Stream<String> stream1 = Stream.of("a", "b", "c")
                                        .filter(element -> element.contains("b"));

        Optional<String> anyElement = stream1.findAny();

//        Optional<String> firstElement = stream1.findFirst(); // IllegalStateException


        List<String> dev1Languages = Arrays.asList("Java", "Python", "C", "C++");
        List<String> dev2Languages = Arrays.asList("JavaScript", "Java", "TypeScript");

//        List<List<String>> combined = Arrays.asList(dev1Languages, dev2Languages);
        // [
        //  [Java, Python, C++],
        //  [JavaScript, Java, TypeScript]
        // ]


        List<List<String>> combined = new ArrayList<>();
        combined.add(dev1Languages);
        combined.add(dev2Languages);

        System.out.println(combined);
        List<String> emptyLst = new ArrayList<>();
        for (int i = 0; i < combined.size(); i++) {
            for (int j = 0; j < combined.get(i).size(); j++) {
                emptyLst.add(combined.get(i).get(j));
            }
        }
        System.out.println(emptyLst);
        emptyLst.clear();

        for (List<String> item: combined) {
            for (String s: item) {
                emptyLst.add(s);
            }
        }

        System.out.println(emptyLst);

        List<String> allLanguages = combined.stream()
                .flatMap(languages -> languages.stream())
                .distinct()
                .toList();

        System.out.println(combined.stream().toList());
        System.out.println(allLanguages);

        Map<String, String> books = new HashMap<>();
        books.put(
                "978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put(
                "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");

        books.entrySet()
                .stream()
                .forEach(stringStringEntry -> {
                    System.out.println(stringStringEntry.getKey());
                    System.out.println(stringStringEntry.getValue());
                });


    }

}
