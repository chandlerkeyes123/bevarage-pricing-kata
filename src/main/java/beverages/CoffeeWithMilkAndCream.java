package beverages;

import java.util.Collection;
import java.util.List;

public class CoffeeWithMilkAndCream extends Coffee {
    @Override
    public double price() {
        return super.price() + AddOns.Milk.price + AddOns.Cream.price;
    }

    @Override
    public Collection<AddOns> addOns() {
        Collection<AddOns> addOns = super.addOns();
        addOns.addAll(List.of(AddOns.Milk, AddOns.Cream));
        return addOns;
    }
}
