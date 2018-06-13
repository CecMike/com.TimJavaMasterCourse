package EncapsulationChallenge;

public class EncapsulationMain {

    public static void main(String[] args) {

        Printer hp = new Printer(100, true);
        Printer dell = new Printer (65, false);
        Printer lexmark = new Printer( 120, true);
        Printer generic = new Printer( 5, true);

        hp.printPapers(100);
        System.out.println("****************");
        dell.chargeTonner(12312);
        System.out.println("*****************");
        lexmark.getTonerLevel();
        System.out.println("*************");
        generic.printPapers(300);
        generic.printPapers(300);
        generic.printPapers(300);
        generic.printPapers(300);
        System.out.println(generic.getPrintedPages());



    }
}
