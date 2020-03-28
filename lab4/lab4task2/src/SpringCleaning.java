public class SpringCleaning implements ICleaningStrategy{
    final int cleaningPower = 95;
    final int timeInMinutes = 120;

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

        if(house.getPercentageOfDirtyOnWalls() >= cleaningPower) house.setPercentageOfDirtyOnWalls(house.getPercentageOfDirtyOnWalls() - cleaningPower);
        else house.setPercentageOfDirtyOnWalls(0);

        if(house.getPercentageOfDirtyUnderSofa() >= cleaningPower) house.setPercentageOfDirtyUnderSofa(house.getPercentageOfDirtyUnderSofa() - cleaningPower);
        else house.setPercentageOfDirtyUnderSofa(0);

        if(house.getPercentageOfDirtyOnDoor() >= cleaningPower) house.setPercentageOfDirtyOnDoor(house.getPercentageOfDirtyOnDoor() - cleaningPower);
        else house.setPercentageOfDirtyOnDoor(0);
    }
}
