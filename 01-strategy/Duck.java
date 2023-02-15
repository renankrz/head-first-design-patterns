public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour b) {
        flyBehaviour = b;
    }

    public void setQuackBehaviour(QuackBehaviour b) {
        quackBehaviour = b;
    }
}
