package complex;

public class Main {
    public static void main(String[] args) {
        Complex c = new Complex(2, 4);//2 + 4i

        Complex x = new Complex(4, 10);
        c.add(x);
        Complex xx = new Complex(2,3);
        x.equals(c);

        x.toString(); // --> 4 + 10i
    }

    // ! c --> ! ( c ) --> ! true/false --> rezultat
    // a  + b --> 2  + 4  ->  rezultat (6)
    // apelMetoda1(apelMetoda())
    // expresii +++ stack/heap
}
