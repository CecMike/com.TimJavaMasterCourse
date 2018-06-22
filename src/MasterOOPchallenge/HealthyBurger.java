package MasterOOPchallenge;

import java.util.ArrayList;

public class HealthyBurger extends BaseBurger {

    public HealthyBurger(String meat) {
        super("Rye Bread Roll", meat);
        super.setPrice(2.99d);
        super.setMaxAddition(6);
    }

    @Override
    public void addingAdditions() {
            ArrayList<String> additionArray = new ArrayList<String>(null);
            System.arraycopy(getAdditions(), 0, additionArray, 0, getAdditions().size());
            if (getAdditions().size() == 6) {
                System.out.println("You can't add any more additions");
            } else {
                System.out.println("What would you like to addition would you like to add?");
                String additional = sc.nextLine();
                additionArray.add(additional);
                System.out.println(additional + " your health addition has been added to the burger for another 01.29c");
                setPrice(getPrice() + 1.29d);
                setAdditions(additionArray);
            }
        }
    }





