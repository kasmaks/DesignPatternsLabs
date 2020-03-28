public class Housewife {
    ICleaningStrategy cleaningStrategy;

    private int freeTimeInMinutes = 0;

    public void setFreeTimeInMinutes(int freeTimeInMinutes) {
        this.freeTimeInMinutes = freeTimeInMinutes;
    }

    public int getFreeTimeInMinutes() {
        return freeTimeInMinutes;
    }

    public void setCleaningStrategy(ICleaningStrategy cleaningStrategy) {
        this.cleaningStrategy = cleaningStrategy;
    }

    public void cleanHouse(House h) {
        if (freeTimeInMinutes >= cleaningStrategy.getTimeInMinutes()) {
            cleaningStrategy.cleanHouse(h);
            freeTimeInMinutes -= cleaningStrategy.getTimeInMinutes();
        }
        else System.out.println("Housewife doesn't have enough time to clean the house");
    }
}
