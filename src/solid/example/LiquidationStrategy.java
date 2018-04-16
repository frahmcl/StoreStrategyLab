package solid.example;

public class LiquidationStrategy implements DiscountStrategy {
    @Override
    public double giveDiscount(double billAmount) {
        double tempBill;
        tempBill = billAmount - (billAmount * 0.75);
        return tempBill;
    }
}
