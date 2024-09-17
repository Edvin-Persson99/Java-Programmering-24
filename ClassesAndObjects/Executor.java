package ClassesAndObjects;

public class Executor {
    public static void main(String[] args) {
        Container container = new Container();
        container.albertosaurus.species = "albertosaurus";
        container.albertosaurus.age = 30;
        container.albertosaurus.skullLenght = 120.0;


        container.trex.species = "Tyrannosaurus rex";
        container.trex.age = 20;
        container.trex.skullLenght = 200.4;


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
    }

}
