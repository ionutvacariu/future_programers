package lantmagazine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Meniu");
        System.out.println("Introdu tip utilizator (AD/UT)");

        Scanner key = new Scanner(System.in);
        while (true) {
            final String next = key.nextLine();
            //final String next = readUserAndPassword();
            if (next.equals("AD")) {
                System.out.println("Meniu administrator");

                System.out.println("1 - afisare magazine");
                System.out.println("2 - selectare magazin");

                //if - user a selectat magazin existent
                {
                    System.out.println("1 - Adaugare produs");
                    // citire de la user informatii despre produs
                    // le adauga intr-un array list de produse -- al magazinului selectat
                    System.out.println("2 - Modificare produs");
                    // citire de la user COD_DE_BARE
                    //if ( cod_de_bare exista)
                    {
                        //modificare produsul -- pretul
                    }
                    System.out.println("3 - Remove produs");
                    // citire de la user informatii despre produs
                    //if ( cod_de_bare exista)
                    {
                        // remove produs din "magazin selectat"
                    }
                    //
                    System.out.println("4 - Afisare produse");
                    //afisarea tuturor produselor din magazin selectat
                    System.out.println("5 - Exit");
                    // serializarea modificarilor --
                }
            } else if (next.equals("UT")) {
                //afisarea tutror magazinelor disponibile
                System.out.println("0 - selectare magazin");
                // citim numele magazinului
                //if(magazinul exista)
                {
                    System.out.println("1 - Afisare produse");
                    // afisam prod magazinului selectat
                    System.out.println("2 - Cumpara produs");
                    // scadem numarul de produse din stoc
                    System.out.println("3 - Exit");
                    // serializare
                }
            } else {
                break;
            }
        }


    }


    static String readUserAndPassword() {
        Scanner key = new Scanner(System.in);
        final String user = key.nextLine();
        final String parola = key.nextLine();

        //read from file
        //if(file contains user + parola)
        {
                //read from file user type
            return "user type readed from file";
        }


    }
}
