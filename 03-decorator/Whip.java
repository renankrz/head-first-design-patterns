public class Whip extends DecoratedBeverage {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public double getCost() {
        return this.beverage.getCost() + 0.39;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }
}
