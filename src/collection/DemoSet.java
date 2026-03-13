package collection;

import java.util.*;

public class DemoSet {

    public static void main(String[] args) {

        List<Integer> nos = new ArrayList<>();
        nos.add(1);
        nos.add(2);
        nos.add(1);

        System.out.println(nos);

        List<Integer> nosLinked = new LinkedList<>(nos);
        System.out.println(nosLinked);

        HashSet<Integer> nosHashSet = new HashSet<>();
        nosHashSet.add(1);
        nosHashSet.add(2);
        nosHashSet.add(1);
        System.out.println(nosHashSet);

        HashSet<User> users = new HashSet<>();
        users.add(new User("raja", 1, 15));
        users.add(new User("raju", 2, 25));
        users.add(new User("nazrin", 3, 25));
        users.add(new User("roja", 5, 5));

        System.out.println("Before Duplicates: "+ users);

        users.add(new User("nazrin", 4, 25));

        System.out.println("After Duplicates: "+ users);


        Set<User> usersLinkedHashSet = new LinkedHashSet<>();
        usersLinkedHashSet.add(new User("raja", 1, 15));
        usersLinkedHashSet.add(new User("raju", 2, 25));
        usersLinkedHashSet.add(new User("nazrin", 3, 25));
        usersLinkedHashSet.add(new User("roja", 5, 5));
        System.out.println(usersLinkedHashSet);

        System.out.println(new LinkedHashSet(users));

    }

}
