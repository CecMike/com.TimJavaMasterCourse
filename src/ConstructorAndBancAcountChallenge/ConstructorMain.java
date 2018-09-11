package ConstructorAndBancAcountChallenge;

public class ConstructorMain {


    public static void main(String[] args) {


        BankAccount johnsAcount = new BankAccount();
        johnsAcount.setBalance(250);
        johnsAcount.setAccountNumber(522365);
        johnsAcount.setCustomerName("John");
        johnsAcount.setEmail("goToHell@highWayTo.hell");
        johnsAcount.setPhoneNumber(0733503665);

        System.out.println(johnsAcount.getBalance());
        johnsAcount.deposit(320);
        System.out.println(johnsAcount.getBalance());
        johnsAcount.witdraw(200);
        System.out.println(johnsAcount.getBalance());
        johnsAcount.witdraw(16600);

        VipCustomer jimmy = new VipCustomer("jimmy", 998);

        System.out.println(jimmy.getCreditLimit());
        System.out.println(jimmy.getEmail());
        System.out.println(jimmy.getName());


    }
}
