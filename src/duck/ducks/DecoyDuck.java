package duck.ducks;

import duck.Duck;
import duck.flyBehavior.FlyNoWay;
import duck.quackBehavior.Squeak;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    @Override
    protected void display() {

    }
}
