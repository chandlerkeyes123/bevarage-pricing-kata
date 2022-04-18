package beverages;

import java.util.Collection;
import java.util.Collections;

public interface Beverage {
    double price();
    default Collection<AddOns> addOns() {
        return Collections.emptyList();
    }
}
