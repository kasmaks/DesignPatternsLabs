public class Apartment {
    private int price;
    private int square;
    private int bedrooms;
    private boolean isNearTheCentre;
    private boolean isNewRenovation;

    Apartment() {}
    Apartment(int price, int bedrooms, int square, boolean isNearTheCentre, boolean isNewRenovation) {
        this.price = price;
        this.square = square;
        this.bedrooms = bedrooms;
        this.isNearTheCentre = isNearTheCentre;
        this.isNewRenovation = isNewRenovation;
    }

    public void getInformation() {
        System.out.println("Price : " + price);
        System.out.println("Bedrooms : " + bedrooms);
        System.out.println("Square : " + square);
        System.out.println("Is near the centre : " + isNearTheCentre);
        System.out.println("Is new renovation : " + isNewRenovation);
    }

    public int getPrice() {
        return price;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getSquare() {
        return square;
    }

    public boolean isNearTheCentre() {
        return isNearTheCentre;
    }

    public boolean isNewRenovation() {
        return isNewRenovation;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setNearTheCentre(boolean nearTheCentre) {
        isNearTheCentre = nearTheCentre;
    }

    public void setNewRenovation(boolean newRenovation) {
        isNewRenovation = newRenovation;
    }

    public void setSquare(int square) {
        this.square = square;
    }
}
