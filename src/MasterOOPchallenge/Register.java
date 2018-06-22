package MasterOOPchallenge;

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
        BaseBurger burgerPick = null;
        burgerPick = burgerChoice(customersChoice);

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
                System.out.println("Your order is a burger with: ");
                burgerPick.printAdditions();
                System.out.println("for " + burgerPick.getPrice() + "$ and a " + makeMenu.getSize() + " menu for " + makeMenu.getMenuPrice());
                System.out.println("Your total price is: " + totalPrice + "$" + "\n"
                        + "Thank you and have a nice day");

                totalPrice = 0;

            } else {
                System.out.println("Your order is a burger with: ");
                burgerPick.printAdditions();
                System.out.println("for " + burgerPick.getPrice() + "$");
                System.out.println("Your total price is: " + totalPrice + "$" + "\n"
                        + "Thank you and have a nice day");

                totalPrice = 0;

            }

        }
    }


    public BaseBurger burgerChoice(int i) {
        String breadIn = null;
        String meatIn = null;
        BaseBurger choiceBurger = null;
        boolean quit = false;
        while (!quit) {
            switch (i) {
                case 1:
                    System.out.println("You have chosen a Classic Burger" + "\n"
                            + "What bread would you like?");
                    breadIn = sc.nextLine();
                    sc.nextLine();
                    System.out.println("What meat?");
                    meatIn = sc.nextLine();
                    choiceBurger = new ClassicBurger(breadIn, meatIn);
                    quit = true;
                    break;

                case 2:
                    System.out.println("You have chosen a healthy burger");
                    System.out.println("What type of meat would you like?");
                    meatIn = sc.nextLine();
                    choiceBurger = new HealthyBurger(meatIn);
                    quit = true;
                    break;

                case 3:
                    System.out.println("You have chosen a Deluxe Burger" + "\n"
                            + "What bread would you like?");
                    breadIn = sc.nextLine();
                    System.out.println("What meat?");
                    meatIn = sc.nextLine();
                    System.out.println("Would you like the menu to be large? y/n");
                    String largeMenu = sc.nextLine();
                    if (largeMenu.endsWith("y")) {
                        choiceBurger = new DeluxeBurger(breadIn, meatIn, "big");
                        quit = true;
                    } else {
                        choiceBurger = new DeluxeBurger(breadIn, meatIn, "medium");
                        quit = true;
                    }
                    break;
            }
        }
        return choiceBurger;
    }
}