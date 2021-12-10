package biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<BookStock> raft = new ArrayList<>();

    /*
    add a book in library
     */
    void addBook(Book book) {
        //TO DO -- add the remaining checks
        if (book.getAuthor() != null && book.getName() != null) {
            BookStock bookStock = new BookStock();
            bookStock.setareBook(book);
            bookStock.setNoOfBooks(1);
            raft.add(bookStock);
        }
    }

    void addBook(Book book, int no) {
        BookStock bookStock = new BookStock();
        bookStock.setareBook(book);
        bookStock.setNoOfBooks(no);
        raft.add(bookStock);
    }
}
