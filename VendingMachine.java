package VendingMachineDesign;

import java.util.List;

public interface VendingMachine {
    public int selectItemAndGetPrice(Item item) throws ItemOutOfStockException;
    public void insertCoin(Coin coin);
    public List<Coin> refund();
    public Bucket<Item, List<Coin>> collectItemAndChange(Item item);
    public void reset();
}
