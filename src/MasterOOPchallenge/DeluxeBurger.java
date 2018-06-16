package MasterOOPchallenge;

public class DeluxeBurger extends BaseBurger{

    private Menu deluxMenu;

    public DeluxeBurger(String name, String breadRoll, String meat, String size) {
        super(name, breadRoll, meat);
        this.deluxMenu = new Menu(true,true, size);
        this.setPrice(getPrice()+deluxMenu.getMenuPrice()*0.2d);
        }


      
}
