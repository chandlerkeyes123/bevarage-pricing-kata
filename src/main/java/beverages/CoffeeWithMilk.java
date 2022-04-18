package beverages;

import java.util.Collection;
import java.util.List;

public class CoffeeWithMilk extends Coffee {
    @Override
    public double price() {
        return super.price() +  AddOns.Milk.price;
    }

    @Override
    public Collection<AddOns> addOns() {
        Collection<AddOns> addOns = super.addOns();
        addOns.addAll(List.of(AddOns.Milk));
        return addOns;
    }
}
