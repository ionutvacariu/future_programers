package inheritance.course;

public class Cat extends Animal {

    public void meow(){
        System.out.println("miau");
    }

    @Override
    public String toString(){
        return "Sunt o pisica si am " + numberOfLegs + " picioare";
    }
}
