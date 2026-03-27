package collection;

import java.util.*;
import java.util.function.BiFunction;

public class DemoMap {

    public static void main(String[] args) {
        Hashtable<String, String> capitals = new Hashtable<>();
        capitals.put("USA", "Washington");
        capitals.put("England", "London");
        capitals.put("France", "Paris");
        capitals.put("France", "PARIS");
        capitals.put("French", "PARIS");
//        capitals.put("French", null);
//        capitals.put(null, "PARIS");

        String value = capitals.get("USA");
        System.out.println("value of USA: " + value);

        System.out.println("keys(): " + capitals.keys());
        System.out.println("keySet(): " + capitals.keySet());

        Set<String> keys = capitals.keySet();

        for (String key : keys) { // for each: for each element in the given collection
            System.out.println(capitals.get(key));
        }
//        Iterator<String> iterator = keys.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(capitals.get(iterator.next()));
//        }

        Enumeration<String> keysEnum = capitals.keys();
        while (keysEnum.hasMoreElements()) {
            String key = keysEnum.nextElement();
            System.out.println("Key: " + key + ", Value: " + capitals.get(key));
        }

        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("French", null);
        capitalCities.put(null, "PARIS");

        System.out.println(capitalCities);

        for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println("entry: " + entry);
        }

        LinkedHashMap<String, Integer> capitalsLinked = new LinkedHashMap<>();

        // Add elements to the map
        capitalsLinked.put("Delhi", 1);
        capitalsLinked.put("Mumbai", 2);
        capitalsLinked.put("Chennai", 3);
        capitalsLinked.put("Bangalore", 4);
        capitalsLinked.put("Bangalore", 14);
        capitalsLinked.put("French", null);
        capitalsLinked.put("Pondi", null);
        capitalsLinked.put(null, null);

        // Iterate through the map, the order is maintained as insertion order
        for (Map.Entry<String, Integer> entry : capitalsLinked.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(capitalsLinked.containsValue(14));
        System.out.println(capitalCities.containsKey("French"));
        System.out.println(capitalCities.getOrDefault("Africa", "NA"));
        System.out.println(capitalCities.get("Africa"));

        String computeStr = capitalCities.compute("India", new BiFunction<String, String, String>() {
            @Override
            public String apply(String key, String value) {
                System.out.println("key: "+key);
                System.out.println("value: "+value);
                return key+" = "+value;
            }
        });

        System.out.println(computeStr);
    }

}
