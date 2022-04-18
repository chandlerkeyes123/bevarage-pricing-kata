package beverages;

import java.util.ArrayList;
import java.util.Collection;

public class TeaWithMilk extends Tea {
    @Override
    public Collection<AddOns> addOns() {
        Collection<AddOns> addOns = new ArrayList<>(super.addOns());
        addOns.add(AddOns.Milk);
        return addOns;
    }
}
