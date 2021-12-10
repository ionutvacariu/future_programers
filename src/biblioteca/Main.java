package biblioteca;

import java.util.Scanner;

/*      1. O biblioteca care sa aiba o lista de carti
            a. Numarul de carti disponibile
            b. Carte :
                i. Autor
                ii. Nume
                iii. isbn
                iv. Gen
                    1) EX: SF, Police, Romantic samd
        1. Create 2 libraries
        a. Centrala
        b. Periferica
        2. Add carte in library
        3. Imprumut carte
        4. Retur carte
 */
public class Main {
    public static void main(String[] args) {
        Library centrala = new Library();
        Library periferica = new Library();

        System.out.println("introdu comanda");
        System.out.println("1. Adauga carte");
        System.out.println("2. Imprumut carte");

        Scanner scanner = new Scanner(System.in);
        final int nrComanda = scanner.nextInt();

        if(nrComanda == 1) {
            System.out.println("introdu autor carte");

            final String autor = scanner.next();

            Book book = new Book(autor, "Prima carte a lui Arghezi", 1, "Drama");

            System.out.println("cate exemplare?") ;
            final int noOfbooks = scanner.nextInt();

            periferica.addBook(book, noOfbooks);

        }
        Book book_2 = new Book("Eminem", "Prima carte a lui Eminem", 1, "Rap");

        centrala.addBook(book_2);
        System.out.println();

    }
}
