import duck.Duck;
import duck.ducks.DecoyDuck;
import duck.ducks.MallarDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("Mallard Duck:");
        Duck mallard = new MallarDuck();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("Decoy Duck:");
        Duck decoy = new DecoyDuck();
        decoy.performFly();
        decoy.performQuack();
    }
}
