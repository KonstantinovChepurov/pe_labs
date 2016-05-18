package asu.state;

public class HasCoinState implements State {
    VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Нельзя поместить больше одной монеты");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Монета возвращена");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }

    @Override
    public void dispense() {
        System.out.println("Товар не выдан");
    }

    @Override
    public void pushSelectButton() {
        System.out.println("Товар выбран...");
        vendingMachine.setState(vendingMachine.getSoldState());
    }

    @Override
    public void refill() {

    }

    public String toString() {
        return "ожидание выбора товара";
    }
}
