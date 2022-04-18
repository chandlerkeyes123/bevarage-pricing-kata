package beverages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CoffeeWithMilk extends Coffee {
    @Override
    public Collection<AddOns> addOns() {
        Collection<AddOns> addOns = new ArrayList<>(super.addOns());
        addOns.add(AddOns.Milk);
        return addOns;
    }
}
