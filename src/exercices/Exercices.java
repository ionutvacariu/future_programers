package exercices;

public class Exercices {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        System.out.println( inc(a) == inc(b) );
        System.out.println(a);
        System.out.println(b);

        System.out.println( a++ == b++ );

        System.out.println(a);
        System.out.println(b);

        System.out.println(a++ == 2 || b++ == 2);
        System.out.println(a);
        System.out.println(b);

        System.out.println(a++ == 2 || b++ == 2);
        System.out.println(a);
        System.out.println(b);

        System.out.println(a++ == 2 || b++ == 2);
        System.out.println(a);
        System.out.println(b);

        IntegerWrapper is = new IntegerWrapper();
        System.out.println(is);
        System.out.println(is.a);
        is.a  = 10;
        is.afisare();

        IntegerWrapperSubclass ir = new IntegerWrapperSubclass();
        ir.afisare();

        System.out.println(inc_iw(ir));
        System.out.println(ir);
        System.out.println(ir.a);

        System.out.println(is.a);

        System.out.println(inc(ir.a));
        System.out.println(ir.a);
    }

    static int inc_iw(IntegerWrapper iw){
        return iw.a ++;
    }

    static int inc(int c){
        int b =  ++c;
        System.out.println(b);
        return b++;
    }


    static int inc_2(int c){
        return ( c++ + 22) * 10;
    }
}
