package Banks;

import Adts.Atm;

public class IOBATM implements Atm {

    @Override
    public double deposit(double amount) {
        return 10000000;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(10000000);
    }

    @Override
    public void showbalance() {
        System.out.println(100000000);
    }

    @Override
    public boolean verifypin(int atmpin) {
        final int actualPin = 1234;
        return atmpin ==actualPin;
    }
}
