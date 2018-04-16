package solid.example;

public class SaleStrategy implements DiscountStrategy{

    @Override
    public double giveDiscount(double billAmount) {
        double tempBill;
        tempBill = billAmount - (billAmount * 0.1);
        return tempBill;
    }
}
