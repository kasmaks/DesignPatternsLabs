public class OrdinaryCleaning implements ICleaningStrategy{
    final int cleaningPower = 70;
    final int timeInMinutes = 60;

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public void cleanHouse(House house) {
        if(house.getPercentageOfDirtyOnFloor() >= cleaningPower) house.setPercentageOfDirtyOnFloor(house.getPercentageOfDirtyOnFloor() - cleaningPower);
        else house.setPercentageOfDirtyOnFloor(0);

        if(house.getPercentageOfDirtyOnShelf() >= cleaningPower) house.setPercentageOfDirtyOnShelf(house.getPercentageOfDirtyOnShelf() - cleaningPower);
        else house.setPercentageOfDirtyOnShelf(0);

        if(house.getPercentageOfDirtyOnWindow() >= cleaningPower) house.setPercentageOfDirtyOnWindow(house.getPercentageOfDirtyOnWindow() - cleaningPower);
        else house.setPercentageOfDirtyOnWindow(0);

        if(house.getPercentageOfDirtyOnGadgets() >= cleaningPower) house.setPercentageOfDirtyOnGadgets(house.getPercentageOfDirtyOnGadgets() - cleaningPower);
        else house.setPercentageOfDirtyOnGadgets(0);
    }
}
