package inheritance.course;

public class Cow extends Animal {

    @Override
    public void eating(Food food) {
        if (food.isVegetable) {
            System.out.println("mananc");
        } else {
            System.out.println("Nu pot manca carne");
        }
    }

    @Override
    public String toString() {
        return "Sunt o vaca  si am " + numberOfLegs + " picioare";
    }

}
