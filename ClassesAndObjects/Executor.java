package ClassesAndObjects;

public class Executor {
    public static void main(String[] args) {
        Container container = new Container();
       

        System.out.println(container.albertosaurus.species);
        System.out.println(container.albertosaurus.age);
        System.out.println(container.albertosaurus.skullLenght);

        System.out.println(container.trex.species);
        System.out.println(container.trex.age);
        System.out.println(container.trex.skullLenght);

        Theropod allosaurus = new Theropod("allosaurus", 90.0);


        Theropod theropod = container.trex;

        System.out.println(container.trex);
        System.out.println(container.albertosaurus);

        System.out.println(allosaurus);
        System.out.println(theropod);
        System.out.println(container.trex.walksWithTheirLegsUnderTheirBody);
        Dinosaur.changeToHungry(container.trex);
        System.out.println(container.trex.isHungry);
    }


}
