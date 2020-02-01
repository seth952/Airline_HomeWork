public enum PlaneType {

    BOEING747(4, 250);


    private final int capacity;
    private final int totalWeight;

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;






    }
}
