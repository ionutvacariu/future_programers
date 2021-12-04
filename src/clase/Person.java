package clase;

public class Person {

    private String nume;
    private String sName;
    private int v;

    public Person() {}

    public Person(String nume, String sName, int v) {
        this.nume = nume;
        this.sName = sName;
        this.v = v;
    }

    String concatNS(Person a) {
        String nume = "GIGEL";
        return this.nume + a.sName;
    }

    public String getName() {
        return this.nume;
    }

    //nu returnam nimic --> voidd
    public void addName(String name) {
        this.nume = name;
        //return nume;
    }


    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public boolean maiMare(Person p2) {
        if (this.v > p2.v) {
            return true;
        }
        return false;
    }
}
