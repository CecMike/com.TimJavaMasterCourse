package MaserOOPchallengeV2;

public class DeluxeBill extends BaseBurger{

    public DeluxeBill() {
        super("Deluxe Bill", 1.99);
//        super.createBurger();
    }

    @Override
    public double createMenu() {
        setMenu(true);
        double menuPriceCompute = 0;
        System.out.println("Would you like to have large fries and a large drink?");
//        scan.nextLine();
        boolean r = scan.nextBoolean();
        if (r) {
            setSize("large");
            menuPriceCompute = (1.29);
            } else {
            setSize("medium");
            menuPriceCompute = (0.79);
        } return menuPriceCompute;
    }
}
