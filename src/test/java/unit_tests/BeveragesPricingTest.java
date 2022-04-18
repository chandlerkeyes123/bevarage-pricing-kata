package unit_tests;

import beverages.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Tea teaWithMilk = new TeaWithMilk();
        assertThat(teaWithMilk.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Coffee coffeeWithMilk = new CoffeeWithMilk();
        assertThat(coffeeWithMilk.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Coffee coffeeWithMilkAndCream = new CoffeeWithMilkAndCream();
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        HotChocolateWithCream hotChocolateWithCream = new HotChocolateWithCream();
        assertThat(hotChocolateWithCream.price(),  is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_beverages_with_cinnamon_price() {
        Map<Double, Beverage> beverages = new HashMap<>();
        beverages.put(1.5, new Tea());
        beverages.put(1.60, new TeaWithMilk());
        beverages.put(1.2, new Coffee());
        beverages.put(1.30, new CoffeeWithMilk());
        beverages.put(1.45, new CoffeeWithMilkAndCream());
        beverages.put(1.45, new HotChocolate());
        beverages.put(1.60, new HotChocolateWithCream());

        for(Map.Entry<Double, Beverage> beverage : beverages.entrySet()){

            beverage.getValue().includeAddOn(AddOns.Cinnamon);

            assertThat(beverage.getValue().price(),
                    is(closeTo(beverage.getKey() + AddOns.Cinnamon.price, 0.001)));
        }
    }
}
