package duck.ducks;

import duck.Duck;
import duck.flyBehavior.FlyWithWings;
import duck.quackBehavior.Quack;

public class MallarDuck extends Duck {
    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    protected void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
