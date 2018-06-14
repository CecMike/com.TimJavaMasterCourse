package MasterOOPchallenge;

public class Menu {

    private Boolean drink;
    private Boolean fries;
    private String size;
    private double menuPrice;

    public Menu(Boolean drink, Boolean fries, String size) {
        this.drink = drink;
        this.fries = fries;
        this.size = size;
        this.menuPrice = calculatePrice(drink, fries, size);
    }

    public double calculatePrice(boolean drink, boolean fries, String size) {
        double price = 0d;
        if (size.equals("small")) {
            if (drink) {
                price += 0.49d;
            }
            if (fries) {
                price += 0.49d;
            }
        } else if (size.equals("medium")) {
            if (drink) {
                price += 0.99d;
            }
            if (fries) {
                price += 0.99d;
            }
        } else if (size.equals("big")) {
            if (drink) {
                price += 1.49d;
            }
            if (fries) {
                price += 1.49d;
            }

        }
        return price;
    }

    public double getMenuPrice() {
        return menuPrice;
    }
}