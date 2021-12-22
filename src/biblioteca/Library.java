package biblioteca;

import java.io.Serializable;
import java.util.ArrayList;

public class Library implements Serializable {

    private ArrayList<BookStock> raft = new ArrayList<>();

    /*
    add a bookParameter in library
     */
    void addBook(Book bookParameter) {
        //TO DO -- add the remaining checks
        if (bookParameter.getAuthor() != null && bookParameter.getName() != null) {
            BookStock bookStock = new BookStock();
            bookStock.setareBook(bookParameter);
            bookStock.setNoOfBooks(1);

            //boolean b = false;
            int i = 0;
            for (; i < raft.size(); i++) {
                Book bookFromRaft = raft.get(i).getBook();
                if (bookFromRaft.egal(bookParameter)) {
                    break;
                }
            }

            if (i < raft.size()) {
                raft.get(i).setNoOfBooks(raft.get(i).getNoOfBooks() + 1);
            } else {
                raft.add(bookStock);
            }
        }
    }

    boolean borrow(Book bookToBorrow) {
        int i = 0;
        for (; i < raft.size(); i++) {
            if (bookToBorrow.egal(raft.get(i).getBook())) {
                final BookStock bookStockFromRaft = raft.get(i);
                int noOfBooks = bookStockFromRaft.getNoOfBooks();
                if (noOfBooks > 0) {
                    noOfBooks = noOfBooks - 1;
                    bookStockFromRaft.setNoOfBooks(noOfBooks);
                } else {
                    System.out.println("Nu mai este pe stoc, incearca mai tarziu !");
                    return false;
                }
                break;
            }
        }

        if (i == raft.size()) {
            System.out.println("doesn't exists");
            return false;
        } else {
            return true;
        }
    }

    boolean returnBook(Book diBuc) {
        int i = 0;
        boolean gasit = false;
        for (; i < raft.size(); i++) {
            if (raft.get(i).getBook().egal(diBuc)) {
                int noOfBooks = raft.get(i).getNoOfBooks();
                noOfBooks++;
                raft.get(i).setNoOfBooks(noOfBooks);
                gasit = true;
                break;
            }
        }

        if (!gasit) {
            System.out.println("Cartea nu'i a me!");
        }

        return gasit;
    }

    public ArrayList<BookStock> getRaft() {
        return raft;
    }

}
