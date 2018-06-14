package MasterOOPchallenge;

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

        boolean quit = false;

        while (!quit) {

            System.out.println("What burger would you like today?" + "\n"
                    + "1.Basic Burger" + "\n"
                    + "2.Healthy Burger" + "\n"
                    + "3.Deluxe Burger");

            int choice = sc.nextInt();

            switch(choice) {

                //choice 1 burger
                case 1:


                    int burgerChoiceIn = sc.nextInt();
                    if (burgerChoiceIn<1 || burgerChoiceIn>3){
                        System.out.println("Invalid input terminating order");
                        quit = true;
                        break;
                    }
                    BaseBurger burgerPick = burgerChoice(burgerChoiceIn);
                    int j = burgerPick.getAdditions().size();
                    while (j<4) {
                        System.out.println("What additions would you like?");
                        burgerPick.addingAdditions();
                        j++;
                        this.totalPrice += burgerPick.getPrice();
                    }

                    if (choice == 1 || choice == 2) {
                        System.out.println("Would you like to make it a menu? y/n");
                        String menuChoice = sc.nextLine();
                        if (menuChoice.equals("y")) {
                            System.out.printf("What size?");
                            String menuSize = sc.nextLine();
                            Menu newMenu = new Menu(true, true, menuSize);
                            this.totalPrice += newMenu.getMenuPrice();
                        } else
                    }


                    BaseBurger burgerPicked = burgerChoice(burgerChoiceIn);

                //choice 2 menu

                //choice 3 anything else?

                //choice 4 order review and payout
            }
        }

    }

    public BaseBurger burgerChoice(int i) {
        switch (i) {
            case 1:
                System.out.println("You have chosen a basic burger" + "\n"
                + "What bread would you like?");
                String breadIn = sc.nextLine();
                System.out.println("What meat?");
                String meatIn = sc.nextLine();
                new ClassicBurger("Classic Burger", breadIn, meatIn);

        }


    }


    public boolean backToStart() {
        String backChoice = sc.nextLine();
        if (backChoice.equals("y")) {
            return true;
        } else if (backChoice.equals("n")) {
            System.out.println("Have a nice day");
            return false;
        } else {
            System.out.println("Invalid input programed crashed");
            return false;
        }
        }
}