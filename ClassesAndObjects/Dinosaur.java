package ClassesAndObjects;

public class Dinosaur {
    boolean walksWithTheirLegsUnderTheirBody = true;
    boolean isHungry;

    public static void walk(){
        System.out.println("The dinosaur is walking");
    }

    public void changeToHungry(Dinosaur dinosaur){
        this.isHungry = true;
    }
}


