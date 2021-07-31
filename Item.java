package VendingMachineDesign;

public enum Item {
    CHIPS("Chips", 10), COLD_DRINK("ColdDrink",20), CHOCOLATES("Chocolate", 30);

    private String name;
    private int price;

    private Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
