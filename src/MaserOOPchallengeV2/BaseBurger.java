package MaserOOPchallengeV2;

import java.util.Scanner;

public class BaseBurger {

    Scanner scan = new Scanner(System.in);

    private String name;
    private String breadType;
    private String meat;
    private String addition1 = null;
    private String addition2 = null;
    private String addition3 = null;
    private String addition4 = null;
    private boolean menu = false;
    private String size = "medium";
    private double price = 0.0d;
    private double menuPrice;

    public BaseBurger(String name, double price) {
        this.name = name;
        this.price = price;
        createBurger();
    }

    public void createBurger() {

        System.out.println("What type of bread would you like?");
        String breadIn = scan.nextLine();
        setBreadType(breadIn);
        System.out.println("What type of meat would you like");
        String meatIn = scan.nextLine();
        setMeat(meatIn);


        System.out.println("You can have up to 4 additions. Is there anything you would like to add?");
        boolean r1 = scan.nextBoolean();
        if (r1) {
            System.out.println("What would you like to add?");
            scan.nextLine();
            setAddition1(scan.nextLine());
            setPrice(getPrice()+0.49d);
            System.out.println("Would you like to add something else?");
            Boolean r2 = scan.nextBoolean();
            scan.nextLine();

            if (r2) {
                System.out.println("What would you like to add?");
                setAddition2(scan.nextLine());
                setPrice(getPrice()+0.49d);
                System.out.println("Would you like to add something else?");
                Boolean r3 = scan.nextBoolean();
                scan.nextLine();

                if (r3) {
                    System.out.println("What would you like to add?");
                    setAddition3(scan.nextLine());
                    setPrice(getPrice()+0.49d);
                    System.out.println("Would you like to add the final addition?");
                    Boolean r4 = scan.nextBoolean();
                    scan.nextLine();

                    if (r4) {
                        System.out.println("What would you like to add?");
                        setAddition4(scan.nextLine());
                        setPrice(getPrice()+0.49d);
                        System.out.println("All additions have been added.");

                    }
                }
            }
        }

        setMenuPrice(createMenu());

    }

    public double createMenu() {
        double menuPriceComp = 0;
        System.out.println("Would you like a menu?");
        boolean r = scan.nextBoolean();
        if (r) {
            this.menu = true;
            System.out.println("What size?");
            scan.nextLine();
            setSize(scan.nextLine());
            if (size.equals("small")) {
                menuPriceComp = 0.49;
            } else if (size.equals("medium")) {
                menuPriceComp = 0.99;
            } else if (size.equals("large")) {
                menuPriceComp = 1.49;
            }

        } return menuPriceComp;
    }

    public void printAdditions() {

        if (addition1 != null) {
            System.out.println(getAddition1());
        }
        if (addition2 != null) {
            System.out.println(getAddition2());
        }
        if (addition3 != null) {
            System.out.println(getAddition3());
        }
        if (addition4 != null) {
            System.out.println(getAddition4());
        }

    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getAddition1() {
        return addition1;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    public String getAddition4() {
        return addition4;
    }

    public void setAddition4(String addition4) {
        this.addition4 = addition4;
    }

    public boolean isMenu() {
        return menu;
    }

    public void setMenu(boolean menu) {
        this.menu = menu;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(double menuPrice) {
        this.menuPrice = menuPrice;
    }
}