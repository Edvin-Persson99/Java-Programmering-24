package ClassesAndObjects;

public class Executor {
    public static void main(String[] args) {
        Container container = new Container();
        container.albertosaurus.species = "albertosaurus something";
        container.albertosaurus.age = 40;
        container.albertosaurus.skullLenght = 121.0;


        container.trex.species = "Tyrannosaurus rex something";
        container.trex.age = 19;
        container.trex.skullLenght = 210.4;


        System.out.println(container.albertosaurus.species);
        System.out.println(container.albertosaurus.age);
        System.out.println(container.albertosaurus.skullLenght);

        System.out.println(container.trex.species);
        System.out.println(container.trex.age);
        System.out.println(container.trex.skullLenght);

        Theropod allosaurus = new Theropod();

        allosaurus.species = "allosaurus";
        allosaurus.age = 10;
        allosaurus.skullLenght = 90.0;

        Theropod theropod = container.trex;

        System.out.println(container.trex);
        System.out.println(container.albertosaurus);

        System.out.println(allosaurus);
        System.out.println(theropod);
    }

}
