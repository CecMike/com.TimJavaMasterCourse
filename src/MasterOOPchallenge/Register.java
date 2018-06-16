package MasterOOPchallenge;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Register {

    private double totalPrice = 0d;
    private int sales = 0;
    private double profit = 0d;
    Scanner sc = new Scanner(System.in);


    public Register() {
    }

    public void order() {

        boolean burgerDelux = false;
        boolean wantMenue = false;

        System.out.println("What burger would you like today?" + "\n"
                + "1.Basic Burger" + "\n"
                + "2.Healthy Burger" + "\n"
                + "3.Deluxe Burger");

        int customersChoice = sc.nextInt();
        if (customersChoice == 3) {
            burgerDelux = true;
        }

        BaseBurger burgerPick = burgerChoice(customersChoice);

        System.out.println("Would you like any extras?");

        String j = sc.nextLine();

        if (j.equals("y")) {
            boolean more = false;
//                System.out.println("What would you like to add?");
            do {
                burgerPick.addingAdditions();
                System.out.println("Would you like to add something else?");
                String evenMore = sc.nextLine();
                if (evenMore.equals("y")) {
                    more = true;
                }
            } while (!more || burgerPick.getAdditions().size() != burgerPick.getMaxAddition());
        }

        Menu makeMenu = new Menu(null, null, null);
        if (!burgerDelux) {
            System.out.println("Would you like to get a menu with that?");
            String addMenu = sc.nextLine();
            if (addMenu.equals("y")) {
                System.out.println("What size would you like?");
                String sizeChoice = sc.nextLine();
                makeMenu = new Menu(true, true, sizeChoice);
            }

            totalPrice = burgerPick.getPrice() + makeMenu.getMenuPrice();
            profit += totalPrice;
            sales++;

            if (wantMenue) {
                System.out.println("Your order is a: " + burgerPick.getName() + " with: ");
                burgerPick.printAdditions();
                System.out.println("for " + burgerPick.getPrice() + "$ and a " + makeMenu.getSize() + " menu for " + makeMenu.getMenuPrice());
                System.out.println("Your total price is: " + totalPrice + "$" + "\n"
                        + "Thank you and have a nice day");

                totalPrice = 0;

            }

        }
    }


    public BaseBurger burgerChoice(int i) {
        switch (i) {
            case 1:
                System.out.println("You have chosen a Classic Burger" + "\n"
                        + "What bread would you like?");
                String breadIn = sc.nextLine();
                System.out.println("What meat?");
                String meatIn = sc.nextLine();
                return new ClassicBurger("Classic Burger", breadIn, meatIn);

            case 2:
                System.out.println("You have chosen a healthy burger");
                System.out.println("What type of meat would you like?");
                String meatIn2 = sc.nextLine();
                return new HealthyBurger(meatIn2);

            case 3:
                System.out.println("You have chosen a Deluxe Burger" + "\n"
                        + "What bread would you like?");
                String breadIn2 = sc.nextLine();
                System.out.println("What meat?");
                String meatIn3 = sc.nextLine();
                System.out.println("Would you like the menu to be large? y/n");
                String largeMenu = sc.nextLine();
                if (largeMenu.endsWith("y")) {
                    return new DeluxeBurger("Deluxe Burger", breadIn2, meatIn3, "big");
                } else {
                    return new DeluxeBurger("Deluxe Burger", breadIn2, meatIn3, "medium");
                }
        }

        return null;
    }
}