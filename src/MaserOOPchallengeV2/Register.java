package MaserOOPchallengeV2;

import java.util.Scanner;

public class Register {

    private double totalPrice = 0d;
    private int sales = 0;
    private double profit = 0d;
    Scanner sc = new Scanner(System.in);

    public Register() {
    }

    public void orderBurger() {
        System.out.println("Welcome to Bill's Burgers!!! \n" +
                "What would you like to have? \n" +
                "1.Classic Bill \n" +
                "2.Healthy Bill \n" +
                "3.Deluxe Bill");

        int choice = sc.nextInt();

        BaseBurger customerOrder = chosenBurger(choice);

        this.totalPrice = (customerOrder.getPrice() + customerOrder.getMenuPrice());
        this.profit += totalPrice;
        this.sales++;

        if (choice == 3) {
            System.out.println("Your order is an " + customerOrder.getName() + " with " + customerOrder.getBreadType() + " bread and " + customerOrder.getMeat() +  " and with the following additions:");
            customerOrder.printAdditions();
            System.out.println("for " + customerOrder.getPrice() + "$ with a " + customerOrder.getSize() + " menu for\n" +
                    customerOrder.getMenuPrice() + "$. The total is: " + getTotalPrice() + "$");
        } else {
            if(customerOrder.isMenu()) {
                System.out.println("Your order is an " + customerOrder.getName() + " with " + customerOrder.getBreadType() + " bread and " + customerOrder.getMeat() +  " and with the following additions:");
                customerOrder.printAdditions();
                System.out.println("for " + customerOrder.getPrice() + "$ with a " + customerOrder.getSize() + " menu for\n" +
                        customerOrder.getMenuPrice() + "$. The total is: " + getTotalPrice() + "$");
            } else {
                System.out.println("Your order is an " + customerOrder.getName() + " with " + customerOrder.getBreadType() + " bread and " + customerOrder.getMeat() +  " and with the following additions:");
                customerOrder.printAdditions();
                System.out.println("for " + customerOrder.getPrice() + "$. The total is: " + getTotalPrice() + "$");
            }
        }

        setTotalPrice(0);

    }

    public BaseBurger chosenBurger(int i) {

        BaseBurger burgerPick = null;

        switch(i) {
            case 1:
                burgerPick = new ClassicBill();
                break;
            case 2:
                burgerPick = new HealthyBill();
                break;
            case 3:
                burgerPick = new DeluxeBill();
                break;
            default:
                System.out.println("You have no idea? try a classic");
                burgerPick = new ClassicBill();
                break;

        } return burgerPick;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
