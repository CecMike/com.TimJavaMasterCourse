package MasterOOPchallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBurger {

    Scanner sc = new Scanner(System.in);

    private String name;
    private String breadRoll;
    private String meat;
    private double price = 1.99d;
    private ArrayList<String> additions = new ArrayList<String>(null);

    public BaseBurger(String name, String breadRoll, String meat) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
    }

    public String getName() {
        return name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<String> getAdditions() {
        return additions;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void addingAdditions() {
        ArrayList<String> additionArray = new ArrayList<String>(null);
        System.arraycopy(getAdditions(), 0, additionArray, 0, getAdditions().size());
        if (getAdditions().size() == 4) {
            System.out.println("You can't add any more additions");
        } else {
            System.out.println("What would you like to addition would you like to add?");
            String additional = sc.nextLine();
            additionArray.add(additional);
            System.out.println(additional + " has been added to the burger for another 0.99c");
            setPrice(getPrice() + 0.99d);
            setAdditions(additionArray);
        }
    }

    public void setAdditions(ArrayList<String> additions) {
        this.additions = additions;
    }
}