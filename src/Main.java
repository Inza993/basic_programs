import oops.inheritance.override.Payment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment("1", 1000, "11");
        System.out.println(payment);

        int i = 1;
        for (; i <= 5; ) {
            System.out.println(i);
            i++;
        }

        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        for (int k = 5; k > 0; k--) {
            System.out.println(k);
        }

        int a = 10;
        System.out.println("a++ " + a++); // in post inc value is returned first and then incremented
        System.out.println("a " + a);

        System.out.println("++a " + (++a)); // in pre inc value is incremented first and then returned
        System.out.println("a " + a);

        do {
            a++; // a = a+1, a += 1
            System.out.println(a);
        } while (a <= 15);


        switch (a) {
            case 16: {
                System.out.println("a is 16");
                break;
            }
            case 17: {
                System.out.println("a is 17");
                break;
            }
            default: {
                System.out.println("default");
            }
        }

        int[][] arr = new int[2][2];
        int[][] arr1 = {{1, 2}, {3, 4, 5, 6, 7}, {15, 16}};
        System.out.println(arr.length);

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                System.out.println(arr1[row][col]);
            }
        }

        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.toString(new int[5]));

    }
}
