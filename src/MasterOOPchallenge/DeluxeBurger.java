package MasterOOPchallenge;

public class DeluxeBurger extends BaseBurger{

    private Menu deluxMenu;

    public DeluxeBurger(String breadRoll, String meat, String size) {
        super(breadRoll, meat);
        this.deluxMenu = new Menu(true,true, size);
        this.setPrice(getPrice()+deluxMenu.getMenuPrice()*0.2d);
        }


      
}
