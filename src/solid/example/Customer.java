package solid.example;

public class Customer {

    private String customerName;
    private double billAmount;
    private DiscountStrategy discountType;

    public DiscountStrategy getDiscountType() {
        return discountType;
    }

    public Customer(String customerName, double billAmount, DiscountStrategy discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public double getBillAmount() {
        return billAmount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", billAmount=" + billAmount +
                ", discountType=" + discountType +
                '}';
    }
}
