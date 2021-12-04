package inheritance.course;

import file.reader.Ferma;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.numberOfLegs = 4;
        cat.meow();
        Food food = new Food();
        food.isVegetable = true;

        cat.eating(food);

        Dog dog = new Dog();
        dog.numberOfLegs = 3;
        dog.ham();
        Food food_for_dog = new Food();
        food_for_dog.isVegetable = true;
        dog.eating(food_for_dog);


        Cow cow = new Cow();
        cow.numberOfLegs = 4;
        cow.eating(food_for_dog);

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(cow);

        Ferma ferma = new Ferma();

        ferma.adaugaAnimalLaFerma(cow);
        ferma.adaugaAnimalLaFerma(dog);
        ferma.adaugaAnimalLaFerma(cat);


        Animal animal_dog = new Dog();

        if (animal_dog instanceof Cat) {
            ((Cat) animal_dog).meow();
        }

        for (int i = 0; i < ferma.getAnimale().size(); i++) {
            System.out.println(ferma.getAnimale().get(i));

            final Animal animal1 = ferma.getAnimale().get(i);


            if (animal1 instanceof Dog) {
                ((Dog) animal1).ham();
            }
        }
    }

}
