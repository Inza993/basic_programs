package oops.string;

public class Demo {

    public static void main(String[] args) {
        // stats, state, tetra, tRt, test
        String name = "nazrin"; // primitive or non-primitive -> non-primitive
        String empID = new String("OKW23");

        System.out.println(name);
        System.out.println(empID);

        for (int i = 0; i < empID.length(); i++) {
            System.out.println(empID.charAt(i));
        }

        System.out.println("name.indexOf(n): "+name.indexOf("n"));
        System.out.println("name.lastIndexOf(n): "+name.lastIndexOf("n"));
        System.out.println("name.contains(a): "+name.contains("a"));

        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hello";
        String s4 = "hello";

        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2)); // a negative value (e.g., -15 distance bw H and W) because 'H' comes before 'W' in Unicode
        System.out.println("s1.compareTo(s3): " + s1.compareTo(s3)); // 0
        System.out.println("s1.compareTo(s4): " + s1.compareTo(s4)); // a negative value (e.g., -32) because 'H' comes before 'h' in Unicode
        System.out.println("s4.compareTo(s1): " + s4.compareTo(s1));

        System.out.println("s1.concat(s2): "+s1.concat(s2));

        System.out.println(s1.replace('l', 'e'));
        System.out.println("state".replaceFirst("t.t", "pac"));
    }

}
