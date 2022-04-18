package beverages;

public class HotChocolateWithCream extends HotChocolate {
    @Override
    public double price() {
        return super.price() + AddOns.Cream.price;
    }
}
