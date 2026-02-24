package oops.oopstask;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryCLI {

    public static void main(String[] args) {
        ArrayList books = new ArrayList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Book Details");

            int bookId = Integer.parseInt(sc.nextLine());
            String title = sc.nextLine();
            String author = sc.nextLine();
            boolean isAvailable = Boolean.parseBoolean(sc.nextLine());

            Book book = new Book(bookId, title, author, isAvailable);
            books.add(book);

            System.out.println("Press q to stop, Enter to continue");
            String input = sc.nextLine();
            if (input.equals("q")) {
                break;
            }
        }

        System.out.println(books);



    }

}
