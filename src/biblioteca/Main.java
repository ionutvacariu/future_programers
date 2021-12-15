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
            final String next = key.nextLine();
            if (next.equals("AD")) {
                meniuAdministrator(lib, key);
                break;
            } else if (next.equals("UT")) {
                //TODO -- extrageti meniul pentru UT intr-o metoda dedicata

                //TODO -- uitati-va peste "testeleNoastre()"  ca sa intelegeti ce naibe e acolo
                final Library library = testeleNoastre();
                System.out.println("Esti utilizator");

                System.out.println("Meniu utilizator");
                System.out.println("Alegeti actiunea ! (1 / 2)");
                System.out.println("1 - Imprumut");
                System.out.println("2 - Retur");
                System.out.println("3 - Afisare carti disponibile");

                while (true) {
                    final String comanda = key.nextLine();
                    if (comanda.equals("1")) {
                        //TODO  -- adaugare functionalitate imprumut carte
                        System.out.println("Imprumutati o carte");
                    } else if (comanda.equals("2")) {
                        //TODO  -- adaugare functionalitate retur carte
                        System.out.println("Ati ales 2, returnati o carte");
                    } else if (comanda.equals("4")) {
                        break;
                    } else {
                        System.out.println("comanda gresita -- reintroduceti");
                        System.out.println("introduceti 4 - pentru a iesi");
                    }
                    System.out.println("Mai doriti sa introduceti o noua comanda?");
                    final String comanda_reintroduusa = key.nextLine();
                    if (!"YES".equals(comanda_reintroduusa)) {
                        break;
                    } else {
                        System.out.println("1 - Imprumut");
                        System.out.println("2 - Retur");
                    }
                }

                break;
            } else {
                System.out.println("Tip inexistent -- reintroduceti (AD/UT)");
            }
        }

    }


    private static void meniuAdministrator(Library lib, Scanner key) {
        System.out.println("Esti admin");
        System.out.println("Adauga carte ? ");
        while (true) {
            final String inputAdmin = key.nextLine();
            if (inputAdmin.equals("YES")) {
                System.out.println("Introdu date carte");
                System.out.println("Introdu autor");
                final String autor = key.nextLine();
                System.out.println("Introdu titlu");
                final String titlu = key.nextLine();
                System.out.println("Introduceti isbn");
                final String isbn = key.nextLine();
                System.out.println("intr gender");
                final String genred = key.nextLine();
                Book bookParameter = new Book(autor, titlu, Integer.valueOf(isbn), genred);
                lib.addBook(bookParameter);
                //System.out.println(lib.getRaft().get(lib.getRaft().size() - 1).getBook());
                System.out.println(bookParameter);
            } else {
                break;
            }
            System.out.println("Mai introduci ?");
        }
        System.out.println("cartile introduse sunt: ");
        for (int i = 0; i < lib.getRaft().size(); i++) {
            System.out.println(lib.getRaft().get(i).getBook());
        }
    }


    private static Library testeleNoastre() {
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

        return periferica;
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
