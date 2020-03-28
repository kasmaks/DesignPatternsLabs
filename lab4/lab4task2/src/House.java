public class House {
    private int percentageOfDirtyOnWindow = 100;
    private int percentageOfDirtyOnDoor = 100;
    private int percentageOfDirtyOnFloor = 100;
    private int percentageOfDirtyOnShelf = 100;
    private int percentageOfDirtyUnderSofa = 100;
    private int percentageOfDirtyOnWalls = 100;
    private int percentageOfDirtyOnGadgets = 100;

    public int getPercentageOfDirtyOnDoor() {
        return percentageOfDirtyOnDoor;
    }

    public int getPercentageOfDirtyOnFloor() {
        return percentageOfDirtyOnFloor;
    }

    public int getPercentageOfDirtyOnGadgets() {
        return percentageOfDirtyOnGadgets;
    }

    public int getPercentageOfDirtyOnShelf() {
        return percentageOfDirtyOnShelf;
    }

    public int getPercentageOfDirtyOnWalls() {
        return percentageOfDirtyOnWalls;
    }

    public int getPercentageOfDirtyOnWindow() {
        return percentageOfDirtyOnWindow;
    }

    public int getPercentageOfDirtyUnderSofa() {
        return percentageOfDirtyUnderSofa;
    }

    public void setPercentageOfDirtyOnDoor(int percentageOfDirtyOnDoor) {
        this.percentageOfDirtyOnDoor = percentageOfDirtyOnDoor;
    }

    public void setPercentageOfDirtyOnFloor(int percentageOfDirtyOnFloor) {
        this.percentageOfDirtyOnFloor = percentageOfDirtyOnFloor;
    }

    public void setPercentageOfDirtyOnGadgets(int percentageOfDirtyOnGadgets) {
        this.percentageOfDirtyOnGadgets = percentageOfDirtyOnGadgets;
    }

    public void setPercentageOfDirtyOnShelf(int percentageOfDirtyOnShelf) {
        this.percentageOfDirtyOnShelf = percentageOfDirtyOnShelf;
    }

    public void setPercentageOfDirtyOnWalls(int percentageOfDirtyOnWalls) {
        this.percentageOfDirtyOnWalls = percentageOfDirtyOnWalls;
    }

    public void setPercentageOfDirtyOnWindow(int percentageOfDirtyOnWindow) {
        this.percentageOfDirtyOnWindow = percentageOfDirtyOnWindow;
    }

    public void setPercentageOfDirtyUnderSofa(int percentageOfDirtyUnderSofa) {
        this.percentageOfDirtyUnderSofa = percentageOfDirtyUnderSofa;
    }

    public void printInfo() {
        System.out.println("Percentage of dirty on Floor: " + percentageOfDirtyOnFloor);
        System.out.println("Percentage of dirty on Windows: " + percentageOfDirtyOnWindow);
        System.out.println("Percentage of dirty on Door: " + percentageOfDirtyOnDoor);
        System.out.println("Percentage of dirty on Shelf: " + percentageOfDirtyOnShelf);
        System.out.println("Percentage of dirty on Walls: " + percentageOfDirtyOnWalls);
        System.out.println("Percentage of dirty on Gadgets: " + percentageOfDirtyOnGadgets);
        System.out.println("Percentage of dirty under Sofa: " + percentageOfDirtyUnderSofa);
    }
}
