package opps.abstraction;

/**
 * Created by JitendraSingh on 29/03/18.
 */
abstract class Bank {
    abstract int getRateOfInterest();
}

class Sbi extends Bank {
    @Override
    int getRateOfInterest() {
        return 7;
    }
}

class Icici extends Bank {

    @Override
    int getRateOfInterest() {
        return 10;
    }
}

class PNB extends Bank {

    @Override
    int getRateOfInterest() {
        return 10;
    }
}

class TestBank {
    public static void main(String[] args) {

        System.out.println("Bankt interest : ");
        Bank b;
        b = new Sbi();
        System.out.println("sbi : "+b.getRateOfInterest()+"%");

        b = new Icici();
        System.out.println("ICICI :"+b.getRateOfInterest()+"%");

        b = new PNB();
        System.out.println("PNB : "+b.getRateOfInterest()+"%");
    }
}
