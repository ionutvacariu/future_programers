package phone.agenda;

public class MainCl {

    public static void main(String[] args) {
        int[] v = {3, 6, 4, 2, 6};
        int a = 2;

        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (a == v[i]) {
                count++;
                break;
            }

        }

        if(count != 0) {
            System.out.println("Exista");
        }else {
            System.out.println("nu exista");
        }


    }


    /// exista   ||  NU EXISTA
}

