package solid.example;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> orders = new ArrayList<>();
        //Discount types S for Sale, D for Discount, L for Liquidation
        orders.add(new Customer("William Walters", 75.34, new DiscountSubStrategy() ));
        orders.add(new Customer("Susan Smothers", 24.12, new SaleStrategy() ));
        orders.add(new Customer("Jessica Johnson", 273.93, new LiquidationStrategy()));
        orders.add(new Customer("Richard Ricardo", 171.42, new DiscountSubStrategy()));

        double total=0;
        DecimalFormat df = new DecimalFormat("###.##");
        for(Customer o: orders) {
            System.out.println(o.getCustomerName() + " " + df.format(o.getDiscountType().giveDiscount(o.getBillAmount())));
            total+= o.getDiscountType().giveDiscount(o.getBillAmount());
        }
        System.out.println("Total:    " + df.format(total));

    }
}
