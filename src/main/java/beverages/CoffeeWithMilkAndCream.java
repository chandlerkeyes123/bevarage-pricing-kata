package beverages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CoffeeWithMilkAndCream extends Coffee {
    @Override
    public Collection<AddOns> addOns() {
        Collection<AddOns> addOns = new ArrayList<>(super.addOns());
        addOns.addAll(List.of(AddOns.Milk, AddOns.Cream));
        return addOns;
    }
}
