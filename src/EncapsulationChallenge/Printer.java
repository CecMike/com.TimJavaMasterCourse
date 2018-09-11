package EncapsulationChallenge;

public class Printer {

    private int tonerLevel = 100;
    private int printedPages = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        if ((tonerLevel>0) && ( tonerLevel <= 100)) {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void chargeTonner(int level) {
        setTonerLevel(level);
    }

    public void printPapers(int numberOfPappers) {
        int consumption=0;
        int count = 0;
        int temp = numberOfPappers;
//        if(tonerLevel == 0) {
//            chargeTonner(100);
//        }

            while (numberOfPappers > 0) {

                switch (tonerLevel) {

                    case 0:
                        chargeTonner(100);
                        break;

                    default:
                    if (duplex) {
                        setPrintedPages(1);
                        numberOfPappers -= 2;
                        count++;
                        count++;
                        if (count >= 5) {
                            if (consumption == getTonerLevel()) {
                                setTonerLevel(-consumption);
                                consumption = 0;
                            } else {
                                consumption++;
                            }
                            count = 0;
                        } break;
                    }else {
                        setPrintedPages(1);
                        numberOfPappers -= 1;
                        count++;

                        if (count == 5) {
                            if (consumption == getTonerLevel()) {
                                setTonerLevel(-consumption);
                            } else {
                                consumption++;
                            }
                            count = 0;
                        } break;
                }
             }
        }
        if (duplex) {
            System.out.println("You printed " + temp / 2 + " pages");
        } else {
            System.out.println("You printed " + temp + " pages");
        }
        System.out.println("For this operation you consumed " + consumption);
            setTonerLevel(-consumption);
    }


    private void setTonerLevel(int tonerLevel) {
        int temp = getTonerLevel();
        if((temp+tonerLevel>100)){
            System.out.println("You only used " + (100 - getTonerLevel()) + " to fill the printer to 100%");
        this.tonerLevel = 100;
        } else if (tonerLevel<0){
            System.out.println("You used " + tonerLevel + "% of your toner and now have " + (temp + tonerLevel) + "% left");
            this.tonerLevel= temp + tonerLevel;
        } else {
            System.out.println("You filled your printer with " + tonerLevel + "% and now your toner level is " + (tonerLevel + temp));
            this.tonerLevel = tonerLevel;
        }
    }

    public int getPrintedPages() {
        return printedPages;
    }

    private void setPrintedPages(int printedPages) {
        int temp = getPrintedPages();
        this.printedPages = printedPages+temp;
    }
}
