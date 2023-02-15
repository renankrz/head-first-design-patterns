public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
