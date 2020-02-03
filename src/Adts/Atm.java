package Adts;

public interface Atm {
    abstract double deposit(double amount);
    abstract void withdraw(double amount);
    void showbalance();
    boolean verifypin( int atmpin);
}


