package asu.state;

public class BrokenState implements State {
    VendingMachine vendingMachine;

    public BrokenState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Device is not operable");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Device is not operable and cannot give anything");
    }

    @Override
    public void dispense() {
        System.out.println("Equipment is not operable");
    }

    @Override
    public void pushSelectButton() {
        System.out.println("Device is broken");
    }

    @Override
    public void refill() {

    }

    @Override
    public String toString() {
        return "Broken equipment";
    }
}
