package solid.example;

public class DiscountSubStrategy implements DiscountStrategy {

    @Override
    public double giveDiscount(double billAmount) {
       double tempBill;
        tempBill = billAmount - (billAmount * 0.5);
        return tempBill;
    }
}
