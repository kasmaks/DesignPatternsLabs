public class Main {
    public static void main(String[] args) {
        House house = new House();

        Housewife housewife = new Housewife();
        housewife.setFreeTimeInMinutes(150);
        ICleaningStrategy cleaningStrategy = new SpringCleaning();
        housewife.setCleaningStrategy(cleaningStrategy);
        housewife.cleanHouse(house);

        house.printInfo();

        System.out.println("Free time: " + housewife.getFreeTimeInMinutes());
    }
}
