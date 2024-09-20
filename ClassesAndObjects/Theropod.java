package ClassesAndObjects;

public class Theropod extends Dinosaur {

    String species;
    int age;
    double skullLenght;

    Theropod(String species, int age, double skullLenght){
        this.species = species;
        this.age = age;
        this.skullLenght = skullLenght;
    }

    Theropod(String species, double skullLenght){
        this(species, 15, skullLenght);
    }

}


