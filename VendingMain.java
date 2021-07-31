package VendingMachineDesign;

import java.util.List;

public class VendingMain {
    public static void main(String[] args) {
        VendingMachineImpl vendingMachine = new VendingMachineImpl();
        vendingMachine.insertCoin(Coin.TEN);
        Bucket<Item, List<Coin>> bucket = vendingMachine.collectItemAndChange(Item.CHIPS);
        System.out.println(bucket.getFirst().getName());

    }
}
