package beverages;

import java.util.Collection;

public class TeaWithMilk extends Tea {
    @Override
    public double price() {
        return super.price() + AddOns.Milk.price;
    }

    @Override
    public Collection<AddOns> addOns() {
        Collection<AddOns> addOns = super.addOns();
        addOns.add(AddOns.Milk);
        return addOns;
    }
}
