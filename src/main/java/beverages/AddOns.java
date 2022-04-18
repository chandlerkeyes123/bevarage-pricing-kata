package beverages;

public enum AddOns {
    Milk(0.10),
    Cream(0.15),
    Cinnamon(0.05);

    public final double price;

    AddOns(double price) {
        this.price = price;
    }
}
