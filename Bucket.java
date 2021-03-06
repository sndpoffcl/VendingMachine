package VendingMachineDesign;

public class Bucket<E1,E2> { // Bucket<Integer,Boolean>
    private E1 first;
    private E2 second;

    public Bucket(E1 first, E2 second) {
        this.first = first;
        this.second = second;
    }

    public E1 getFirst() {
        return first;
    }

    public void setFirst(E1 first) {
        this.first = first;
    }

    public E2 getSecond() {
        return second;
    }

    public void setSecond(E2 second) {
        this.second = second;
    }
}