package duck;

import duck.flyBehavior.FlyBehavior;
import duck.quackBehavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    abstract void display();
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    public static void swim() {
        System.out.println("All ducks float, even decoys!");
        System.out.println("I'm swimming!");
    }


}
