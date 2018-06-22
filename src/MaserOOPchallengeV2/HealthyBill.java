package MaserOOPchallengeV2;

public class HealthyBill extends BaseBurger {

    private String addition5;
    private String addition6;

    public HealthyBill() {
        super("Healthy Bill", 2.99d);
//        createBurger();

    }

    @Override
    public void createBurger() {

        setBreadType("Rye Bread");
        System.out.println("What type of meat would you like");
        String meatIn = scan.nextLine();
        setMeat(meatIn);


        System.out.println("You can have up to 6 additions. Is there anything you would like to add?");
        boolean r1 = scan.nextBoolean();
        if (r1) {
            System.out.println("What would you like to add?");
            scan.nextLine();
            setAddition1(scan.nextLine());
            setPrice(getPrice()+0.69d);
            System.out.println("Would you like to add something else?");
            Boolean r2 = scan.nextBoolean();
            scan.nextLine();

            if (r2) {
                System.out.println("What would you like to add?");
                setAddition2(scan.nextLine());
                setPrice(getPrice()+0.69d);
                System.out.println("Would you like to add something else?");
                Boolean r3 = scan.nextBoolean();
                scan.nextLine();

                if (r3) {
                    System.out.println("What would you like to add?");
                    setAddition3(scan.nextLine());
                    setPrice(getPrice()+0.69d);
                    System.out.println("Would you like to add something else?");
                    Boolean r4 = scan.nextBoolean();
                    scan.nextLine();

                    if (r4) {
                        System.out.println("What would you like to add?");
                        setAddition4(scan.nextLine());
                        setPrice(getPrice()+0.69d);
                        System.out.println("Would you like to add something else?");
                        Boolean r5 = scan.nextBoolean();
                        scan.nextLine();

                        if (r5) {
                            System.out.println("What would you like to add?");
                            setAddition5(scan.nextLine());
                            setPrice(getPrice() + 0.69d);
                            System.out.println("Would you like to add a final extra?");
                            Boolean r6 = scan.nextBoolean();
                            scan.nextLine();

                            if (r6) {
                                System.out.println("What would you like to add?");
                                setAddition6(scan.nextLine());
                                setPrice(getPrice() + 0.69d);
                                System.out.println("All additions have been added.");

                            }
                        }
                    }
                }
            }
        }

        setMenuPrice(createMenu());
    }

    @Override
    public void printAdditions() {
        if (super.getAddition1() != null) {
            System.out.println(getAddition1());
        }
        if (super.getAddition2() != null) {
            System.out.println(getAddition2());
        }
        if (super.getAddition3() != null) {
            System.out.println(getAddition3());
        }
        if (super.getAddition4() != null) {
            System.out.println(getAddition4());
        }
        if (addition5 != null) {
            System.out.println(getAddition5());
        }
        if (addition6 != null) {
            System.out.println(getAddition6());
        }
    }

    public String getAddition5() {
        return addition5;
    }

    public void setAddition5(String addition5) {
        this.addition5 = addition5;
    }

    public String getAddition6() {
        return addition6;
    }

    public void setAddition6(String addition6) {
        this.addition6 = addition6;
    }
}
