package asu.state;

public class SoldState implements State {

    VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Товар выдается");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Вы уже выбрали товар, отмена невозможна");
    }

    @Override
    public void dispense() {
        vendingMachine.giveGood();
        if (vendingMachine.getCount() > 0) {
            vendingMachine.setState(vendingMachine.getNoCoinState());
        } else {
            System.out.println("Товары закончились...!");
            vendingMachine.setState(vendingMachine.getSoldOutState());
        }
    }

    @Override
    public void pushSelectButton() {
        System.out.println("Двойное нажатие");
    }

    @Override
    public void refill() {

    }
}
