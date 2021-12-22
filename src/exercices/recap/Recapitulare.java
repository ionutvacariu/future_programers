package exercices.recap;

public class Recapitulare {

    private String blah;

    public Recapitulare(String blah) {
        this.blah = blah;
    }

    /**
     * public  -- modificator de access
     * static --
     * void --
     * main --
     * String [] args -- [A B C]
     *
     * @param argsasdasdasdasdasd
     */
    public static void main(String[] argsasdasdasdasdasd) {
        int i = 0;
        int j = 1;

        System.out.println(i++);  // D: 0 V:0 I: 0
        System.out.println(++i); // D : 1 V:1 I: 2
        System.out.println(i++ + ++i); // D: 5 V:7 I: 6
        if (++i == 4) {
            System.out.println(i++ + ++j); // D : n
        }


        if (i++ == 5 && i++ == 5) {
            System.out.println(j++); //D: n
        }

        System.out.println(i); //D: 8 S: 3 V:8
        System.out.println(j); //D: 1 S:1  V:1


        String[] vec = {"asd", "bca", "cba", "ccc", "asd"};

        for (int k = 0; k < vec.length; k++) {
            System.out.print(vec[k] + " ");
        }
        System.out.println();


        for (int z = 0; z < vec.length; z++) {
            int t = z + 1;
            for (; t < vec.length; t++) {
                if (vec[z].compareTo(vec[t]) > 0) {
                    String mareString;
                    mareString = vec[z];
                    vec[z] = vec[t];
                    vec[t] = mareString;
                }
            }
        }
        for (int k = 0; k < vec.length; k++) {
            System.out.print(vec[k] + " ");
        }

        System.out.println();


        boolean mareBool = new Recapitulare("alt mare string_2").main("St");


        if (mareBool) {
            System.out.println("s-a afisat");
        } else {
            System.out.println("nu s-a afisat");
        }

        String s = "asd";
        String b = "asd";

    }


    private boolean main(String s) {
        if (s.length() > 10) {
            System.out.println(s);
            return true;
        }
        return false;
    }
}
