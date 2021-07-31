package VendingMachineDesign;

public enum Coin {
    ONE(1), TWO(2), FIVE(5), TEN(10);

    private int amount;

    Coin(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
