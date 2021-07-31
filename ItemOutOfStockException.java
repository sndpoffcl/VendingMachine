package VendingMachineDesign;

public class ItemOutOfStockException extends Exception {
    public ItemOutOfStockException() {
    }

    public ItemOutOfStockException(String message) {
        super(message);
    }

    public ItemOutOfStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemOutOfStockException(Throwable cause) {
        super(cause);
    }

    public ItemOutOfStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
