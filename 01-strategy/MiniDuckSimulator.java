public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck d1 = new MallardDuck();
        d1.performFly();
        d1.performQuack();

        Duck d2 = new RubberDuck();
        d2.performFly();
        d2.performQuack();

        // Change the behaviour dynamically
        d2.setFlyBehaviour(new FlyWithWings());
        d2.performFly();
    }
}
