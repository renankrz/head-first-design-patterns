public class Mocha extends DecoratedBeverage {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double getCost() {
        return this.beverage.getCost() + 0.20;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }
}
