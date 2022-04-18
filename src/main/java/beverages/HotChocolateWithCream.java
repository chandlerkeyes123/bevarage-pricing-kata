package beverages;

import java.util.Collection;
import java.util.List;

public class HotChocolateWithCream extends HotChocolate {
    @Override
    public double price() {
        return super.price() + AddOns.Cream.price;
    }

    @Override
    public Collection<AddOns> addOns() {
        Collection<AddOns> addOns = super.addOns();
        addOns.add(AddOns.Cream);
        return addOns;
    }
}
