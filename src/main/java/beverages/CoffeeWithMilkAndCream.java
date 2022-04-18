package beverages;

public class CoffeeWithMilkAndCream extends Coffee {
    @Override
    public double price() {
        return super.price() + AddOns.Milk.price + AddOns.Cream.price;
    }
}
