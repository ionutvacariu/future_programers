package file.reader;

import inheritance.course.Animal;

import java.util.ArrayList;

public class Ferma {

    private ArrayList<Animal> animale = new ArrayList<>();

    public void adaugaAnimalLaFerma(Animal animal) {
        this.animale.add(animal);
    }

    public ArrayList<Animal> getAnimale() {
        return animale;
    }
}
