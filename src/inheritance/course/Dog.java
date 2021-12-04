package inheritance.course;


public class Dog extends Animal {

    String s;

    public void ham() {
        System.out.println("ham");
    }

    @Override
    public String toString() {
        return "Sunt un caine si am " + numberOfLegs + " picioare";
    }


}
