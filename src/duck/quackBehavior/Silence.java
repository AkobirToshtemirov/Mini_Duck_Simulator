package duck.quackBehavior;

public class Silence implements QuackBehavior {
    public void quack(){
        System.out.println("I don't quack!");
    }
}
