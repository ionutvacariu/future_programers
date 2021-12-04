package file.reader;

public class Main {

    public static void main(String[] args) {
        /*
        1. creem o lista  -- lista o sa contina doar elemente pe carenoi le adaugam
                          -- vectorul o  aiba si acele 0 -uri
        2. afisarea listei create
        3. remove de la o anumita pozitie
        4. remove o anumita valoare
        5. sortarea
         */

        CustomListInteger list = new CustomListInteger();

        // < orice_tip_de_obiect >


        list.add(5);
        list.add(67);
        list.add(3);
        list.add(1);

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        int a = 1;
        list.removePozitie(a); // 5 67 0 0 --> 5 3 1 _ _
        //   list.removePozitie(-5); // NU EXIST


        int[] sort = list.sort();
        // 1 3 5 _ _
        for (int kj = 0; kj < list.size(); kj++) {
            System.out.println(sort[kj]);
        }

    }

}
