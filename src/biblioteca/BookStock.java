package biblioteca;

public class BookStock {

    private int noOfBooks = 1;
    private Book book;

    void setareBook(Book bbb) {
        this.book = bbb;
    }

    void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
