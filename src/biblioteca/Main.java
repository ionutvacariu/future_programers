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

        System.out.println("Meniu");
        System.out.println("Introdu tip utilizator (AD/UT)");

        Library lib = new Library();

        Scanner key = new Scanner(System.in);
        while (true) {
            final String next = key.next();
            if (next.equals("AD")) {
                System.out.println("Esti admin");

                System.out.println("Adauga carte ? ");
                while (true) {
                    final String inputAdmin = key.next();
                    if (inputAdmin.equals("YES")) {
                        System.out.println("Introdu date carte");
                        System.out.println("Introdu autor");
                        final String autor = key.next();
                        System.out.println("Introdu titlu");
                        final String titlu = key.next();
                        //  TODO -- completati cu citirea...

                        lib.addBook(new Book(autor, titlu, 1, "GEN"));

                        //TODO afisare carte introdusa
                    }else {
                        break;
                    }
                    System.out.println("Mai introduci ?");
                }
                //TODO -- listati toate cartile introduse
                // for .. rafturile din biblioteca --- > sout ( raft.get(i).getbookStock.getName + raf...get + raf .. )
                break;
            } else if (next.equals("UT")) {
                System.out.println("Esti utilizator");
                break;
            } else {
                System.out.println("Tip inexistent -- reintroduceti (AD/UT)");
            }
        }

        //testeleNoastre();
    }

    private static void testeleNoastre() {
        Library centrala = new Library();
        Library periferica = new Library();
        Book book = new Book("Tudor Arghezi", "Prima carte a lui Arghezi", 1, "Drama");
        Book book_2 = new Book("Eminem", "Prima carte a lui Eminem", 2, "Rap");

        centrala.addBook(book_2);
        periferica.addBook(book);
        periferica.addBook(book_2);
        periferica.addBook(book_2);
        Book book_3 = new Book("Eminescu", "Somnoroase pasarel", 2, "Rap");
        periferica.addBook(book_3);


        periferica.borrow(book_2);
        periferica.borrow(book_2);
        periferica.borrow(book_2);
        periferica.borrow(book_2);
        periferica.borrow(book_2);

        final Book book1 = new Book("ASB", "ASD", 2, "ASDD");
        periferica.borrow(book1);
        periferica.returnBook(book_2);
        periferica.returnBook(book1);
    }

    private static void extracted(Library centrala, Library periferica) {
        System.out.println("introdu comanda");
        System.out.println("1. Adauga carte");
        System.out.println("2. Imprumut carte");

        Scanner scanner = new Scanner(System.in);
        final int nrComanda = scanner.nextInt();

        if (nrComanda == 1) {
            System.out.println("introdu autor carte");

            final String autor = scanner.next();

            Book book = new Book(autor, "Prima carte a lui Arghezi", 1, "Drama");

            System.out.println("cate exemplare?");
            final int noOfbooks = scanner.nextInt();

            periferica.addBook(book);

        }
        Book book_2 = new Book("Eminem", "Prima carte a lui Eminem", 1, "Rap");

        centrala.addBook(book_2);
    }
}
