package biblioteca;

import java.io.*;
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
    public static void main(String[] args) throws Exception {

        System.out.println("Meniu");
        System.out.println("Introdu tip utilizator (AD/UT)");

        Library lib = new Library();

        Scanner key = new Scanner(System.in);
        while (true) {
            final String next = key.nextLine();
            if (next.equals("AD")) {
                meniuAdministrator(lib, key);
                saveLibraryToFile(lib);
                break;
            } else if (next.equals("UT")) {
                meniuUtilizator(key);
                break;
            } else {
                System.out.println("Tip inexistent -- reintroduceti (AD/UT)");
            }
        }

    }


    private static void meniuUtilizator(Scanner key) throws Exception {


        FileInputStream fileInputStream
                = new FileInputStream("yourfile2.txt");
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
        Library library = (Library) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Esti utilizator");

        System.out.println("Meniu utilizator");
        System.out.println("Alegeti actiunea ! (1 / 2)");
        System.out.println("1 - Imprumut");
        System.out.println("2 - Retur");
        System.out.println("3 - Afisare carti disponibile");

        while (true) {
            final String comanda = key.nextLine();
            if (comanda.equals("1")) {
                System.out.println("Imprumutati o carte");
                final Book bookToBorrow = citireCarteDeLaTastatura(key);
                final boolean borrow = library.borrow(bookToBorrow);
                if (borrow) {
                    System.out.println("ai imprumutat " + bookToBorrow.toString());
                }
            } else if (comanda.equals("2")) {
                //TODO  -- adaugare functionalitate retur carte
                System.out.println("Ati ales 2, returnati o carte");
            } else if (comanda.equals("4")) {
                //serializeaza lirary (path catre fisier)
                saveLibraryToFile(library);
                break;
            } else if (comanda.equals("3")) {
                for (int i = 0; i < library.getRaft().size(); i++) {
                    System.out.print(library.getRaft().get(i).getBook());
                    System.out.println(" este in " + library.getRaft().get(i).getNoOfBooks()+ " exemplare.");
                }
            } else {
                System.out.println("comanda gresita -- reintroduceti");
                System.out.println("introduceti 4 - pentru a iesi");
            }
            System.out.println("Mai doriti sa introduceti o noua comanda?");
            final String comanda_reintroduusa = key.nextLine();
            if (!"YES".equals(comanda_reintroduusa)) {
                saveLibraryToFile(library);
                break;
            } else {
                System.out.println("1 - Imprumut");
                System.out.println("2 - Retur");
            }
        }

    }

    private static void saveLibraryToFile(Library library) throws IOException {
        System.out.println("SALVAM LIBRARIA");
        FileOutputStream fileOutputStream
                = new FileOutputStream("yourfile2.txt");
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(library);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    private static void meniuAdministrator(Library lib, Scanner key) {
        System.out.println("Esti admin");
        System.out.println("Adauga carte ? ");
        while (true) {
            final String inputAdmin = key.nextLine();
            if (inputAdmin.equals("YES")) {
                Book bookParameter = citireCarteDeLaTastatura(key);
                lib.addBook(bookParameter);
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

    private static Book citireCarteDeLaTastatura(Scanner key) {
        System.out.println("Introdu date carte");
        System.out.println("Introdu autor");
        final String autor = key.nextLine();
        System.out.println("Introdu titlu");
        final String titlu = key.nextLine();
        System.out.println("Introduceti isbn");
        final String isbn = key.nextLine();
        System.out.println("intr gender");
        final String genred = key.nextLine();
        return new Book(autor, titlu, Integer.valueOf(isbn), genred);
    }


    private static Library populateLibrary() {

        Library periferica = new Library();
        Book book = new Book("Tudor Arghezi", "Prima carte a lui Arghezi", 1, "Drama");
        Book book_2 = new Book("Eminem", "Prima carte a lui Eminem", 2, "Rap");
        Book book_3 = new Book("Eminescu", "Somnoroase pasarel", 2, "Rap");
        periferica.addBook(book);
        periferica.addBook(book_2);
        periferica.addBook(book_3);

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


    static class MyClass {
        Library l;
        Book b;
    }

}
