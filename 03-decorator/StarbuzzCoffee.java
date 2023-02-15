public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage b1 = new HouseBlend();
        b1 = new Mocha(b1);
        System.out.println(b1.getDescription() + " $" + b1.getCost());

        Beverage b2 = new Espresso();
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println(b2.getDescription() + " $" + b2.getCost());
    }
}
