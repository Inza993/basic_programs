package oops.constructor;

public class Book {

    // variable declaration
    String bookName;
    String authorName;
    int pages;
    int readPages;

    // Constructor
    // no return type or doesn't return anything
    Book(String bookNameValue, String authorNameValue, int pagesValue, int readPagesValue) {
        bookName = bookNameValue;
        authorName = authorNameValue;
        pages = pagesValue;
        readPages = readPagesValue;
    }

//    Book() {
//
//    }

    void setBookValues(String bookNameValue, String authorNameValue, int pagesValue, int readPagesValue) {
        bookName = bookNameValue;
        authorName = authorNameValue;
        pages = pagesValue;
        readPages = readPagesValue;
    }

    void readPages(int pageCount)
    {
        readPages =  pages-pageCount;
    }

    void bookReadStatus()
    {
        System.out.println(bookName);
        System.out.println(authorName);
        System.out.println(pages);
        System.out.println(readPages);
    }

    public static void main(String[] args)
    {
        Book book = new Book("Treasure Island", "Robert Louis", 400, 0);
//        book.setBookValues("Treasure Island", "Robert Louis", 400, 0);
        book.bookReadStatus();
        System.out.println("Status of pages read");
        book.readPages(20);
        book.bookReadStatus();

        Book kotlinBook = new Book("Kotlin in Action", "Roman", 500, 0);
//        kotlinBook.setBookValues("Kotlin in Action", "Roman", 500, 0);
        kotlinBook.bookReadStatus();
    }
}
