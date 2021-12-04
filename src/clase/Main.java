package clase;

public class Main {

    public static void main(String[] args) {


        //sta pe stack  -- > a = 5
        int a = 5;
        // p - idetificator/referinta/variabila/instanta/obiect
        // p =  stack --- valoarea lui sta pe heap
        Person p = new Person();
        p.addName("Daniel");
        System.out.println(p.getName());

        Person p2 = new Person("ion", "vacariu", 55);


        System.out.println(p2.concatNS(p));

        Person p3 = new Person("ionut ", "vacariu", 55);
        System.out.println(p3.concatNS(p3));

        System.out.println(p2.getName());

        System.out.println(p3.getName());


        System.out.println(p2.maiMare(p3));

    }


}
