package beverages;

import java.util.Collection;
import java.util.Collections;

public interface Beverage {
    double basePrice();
    default double price() {
        return addOns().stream()
                .map(addOns -> addOns.price)
                .reduce(basePrice(), Double::sum);
    };
    default Collection<AddOns> addOns() {
        return Collections.emptyList();
    }
}
