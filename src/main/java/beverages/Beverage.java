package beverages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public abstract class Beverage {
    private Collection<AddOns> addons;

    public Beverage() {
        this(new ArrayList<>());
    }

    public Beverage(Collection<AddOns> addons){
        this.addons = addons;
    }

    public abstract double basePrice();
    public double price() {
        return addOns().stream()
                .map(addOns -> addOns.price)
                .reduce(basePrice(), Double::sum);
    };
    public Collection<AddOns> addOns() {
        return addons;
    }
    public boolean includeAddOn(AddOns addOn){
        return addons.add(addOn);
    }
}
