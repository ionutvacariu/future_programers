package biblioteca;

public class Book {

    private String author;
    private String name;
    private int isbn;
    private String gender;

    Book(String p1, String name, int isbn, String gender) {
        author = p1;
        this.name = name;
        this.isbn = isbn;
        this.gender = gender;
    }

    public Book() {
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getGender() {
        return gender;
    }

    boolean egal(Book book) {
        // this o sa fie obj care apeleaza metoda  -- bookFromRaft
        // book <--> referinta primita ca parametru  -- bookParameter
        if (this.author.equals(book.author) && this.name.equals(book.name)
                && this.isbn == book.isbn && this.gender.equals(book.gender)) {
            return true;
        }
        return false;
    }

}
