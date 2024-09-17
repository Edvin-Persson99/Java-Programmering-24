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
    }

}
