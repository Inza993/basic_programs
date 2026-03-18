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

        System.out.println("Before Duplicates: " + users);

        users.add(new User("nazrin", 4, 25));

        System.out.println("After Duplicates: " + users);


        Set<User> usersLinkedHashSet = new LinkedHashSet<>();
        usersLinkedHashSet.add(new User("raja", 1, 15));
        usersLinkedHashSet.add(new User("raju", 2, 25));
        usersLinkedHashSet.add(new User("nazrin", 3, 25));
        usersLinkedHashSet.add(new User("roja", 5, 5));
        System.out.println(usersLinkedHashSet);

        System.out.println(new LinkedHashSet(users));


        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(11);
        set2.add(2);
        set2.add(33);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection: " + intersection);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2); //
        System.out.println("difference: " + difference);

        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(5);
        integerTreeSet.add(3);
        integerTreeSet.add(4);
        integerTreeSet.add(6);
        integerTreeSet.add(6);
        integerTreeSet.add(0);

        System.out.println(integerTreeSet);

        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("raja");
        stringTreeSet.add("raju");
        stringTreeSet.add("nazrin");
        stringTreeSet.add("Roja");

        System.out.println(stringTreeSet);

        TreeSet<Character> chars = new TreeSet<>();
        String name = "raja";
        for (int i = 0; i < name.length(); i++) {
            chars.add(name.charAt(i));
        }
        System.out.println(chars);

        System.out.println("subset(): " + stringTreeSet.subSet("Roja", "raja"));
        System.out.println("subset(): " + stringTreeSet.subSet("Roja", false, "raja", true));

        System.out.println("tail(): " + stringTreeSet.tailSet("nazrin"));
        System.out.println("tail(): " + stringTreeSet.tailSet("nazrin", false));

        int[] arr = {5, 4, 3, 2};
        bubbleSort(arr);

        User[] userArr = new User[3];
        userArr[0] = new User("raja", 60, 19);
        userArr[1] = new User("raja", 60, 18);
        userArr[2] = new User("raja", 60, 14);
        bubbleSortUser(userArr);

        List<User> usersArrList = new ArrayList<>();
        usersArrList.add(new User("raja", 1, 15));
        usersArrList.add(new User("raju", 2, 25));
        usersArrList.add(new User("nazrin", 3, 25));
        usersArrList.add(new User("roja", 5, 5));
        bubbleSortUser(usersArrList);

        System.out.println("a".compareTo("a"));
        System.out.println("a".compareTo("z"));
        System.out.println("z".compareTo("a"));

        bubbleSortUserName(usersArrList);

        TreeSet<User> userTreeSet = new TreeSet<>();
        userTreeSet.add(new User("name", 30, 14));
        userTreeSet.add(new User("raja", 60, 12));

        System.out.println("userTreeSet: "+userTreeSet);

        List<User> usersArrList2 = new ArrayList<>();
        usersArrList2.add(new User("raja", 1, 15));
        usersArrList2.add(new User("raju", 2, 25));
        usersArrList2.add(new User("nazrin", 3, 25));
        usersArrList2.add(new User("roja", 5, 5));

        Collections.sort(usersArrList2);
        System.out.println("usersArrList2: "+usersArrList2);

        // comparator
    }

    static void bubbleSortUserName(List<User> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
//                if (arr.get(j).id > arr.get(j + 1).id) {
                if (arr.get(j).name.compareTo(arr.get(j + 1).name) > 0) {
                    User temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
            System.out.println(arr);
        }

        System.out.println("End result: "+arr);
    }

    static void bubbleSortUser(List<User> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j).id > arr.get(j + 1).id) {
                    User temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
            System.out.println(arr);
        }

        System.out.println("End result: "+arr);
    }


    static void bubbleSortUser(User[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].age > arr[j + 1].age) {
                    User temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("End result: "+Arrays.toString(arr));
    }


    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("End result: "+Arrays.toString(arr));
    }

}
