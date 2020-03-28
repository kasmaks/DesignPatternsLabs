public class FastCleaning implements ICleaningStrategy {
    final int cleaningPower = 30;
    final int timeInMinutes = 30;

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public void cleanHouse(House house) {
        if(house.getPercentageOfDirtyOnFloor() >= cleaningPower) house.setPercentageOfDirtyOnFloor(house.getPercentageOfDirtyOnFloor() - cleaningPower);
        else house.setPercentageOfDirtyOnFloor(0);

        if(house.getPercentageOfDirtyOnShelf() >= cleaningPower) house.setPercentageOfDirtyOnShelf(house.getPercentageOfDirtyOnShelf() - cleaningPower);
        else house.setPercentageOfDirtyOnShelf(0);
    }
}
