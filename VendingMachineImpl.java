package VendingMachineDesign;

import java.util.List;

public class VendingMachineImpl implements VendingMachine {
    private Inventory<Coin> coinInventory = new Inventory<>();
    private Inventory<Item> itemInventory = new Inventory<>();
    private int currentBalance = 0; // money given by user per transaction

    private void initialize(){
        for(Coin c : Coin.values()){
            coinInventory.put(c,5);
        }

        for(Item i : Item.values()){
            itemInventory.put(i,5);
        }
    }

    public VendingMachineImpl(){
        initialize();
    }

    @Override
    public int selectItemAndGetPrice(Item item) throws ItemOutOfStockException {
       if(itemInventory.hasItem(item)){
            return item.getPrice();
       }
       throw new ItemOutOfStockException("Selected Item is out of stock");
    }

    @Override
    public void insertCoin(Coin coin) {
        coinInventory.add(coin);
        currentBalance = currentBalance + coin.getAmount();
    }

    @Override
    public List<Coin> refund() {
        return null;
    }


    public Bucket<Item, List<Coin>> collectItemAndChange(Item item) {
        Item collectedItem = collectItem(item);
        List<Coin> collectedChange = collectChange(item);
        Bucket<Item, List<Coin>> bucket = new Bucket<Item, List<Coin>>(collectedItem, collectedChange);
        currentBalance = 0;
        return bucket;
     }

    private Item collectItem(Item i) {
        if (currentBalance >= i.getPrice()) {
            // if exact amount entered, no need to check suff change
            if (hasSufficientChange()) {
                itemInventory.reduce(i);
                return i;
            }else{
                //throw an exception
                System.out.println("Do not have suff change");
            }
        }else{
            //throw an exception
            System.out.println("Invalid amount of money entered");
            //return the inserted money
        }
        return null;
    }

    private List<Coin> collectChange(Item i){
        int diff = currentBalance - i.getPrice();
        // logic for returning change // reduce the numbers in the coin inventory
        return null;
    }

    private boolean hasSufficientChange(){
        return true;
    }

    @Override
    public void reset () {
        coinInventory.clear();
        itemInventory.clear();
        currentBalance = 0;
    }

}
