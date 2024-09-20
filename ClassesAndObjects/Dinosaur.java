package ClassesAndObjects;

public class Dinosaur {
    boolean walksWithTheirLegsUnderTheirBody = true;
    boolean isHungry;

    public static void walk(){
        System.out.println("The dinosaur is walking");
    }

    public static void changeToHungry(Dinosaur dinosaur){
        dinosaur.isHungry = true;
    }
}


