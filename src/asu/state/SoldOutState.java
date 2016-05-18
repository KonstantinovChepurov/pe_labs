package asu.state;

public class SoldOutState implements State {

    VendingMachine vendingMachine;

    public SoldOutState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Нельзя поместить монету, все товары распроданы");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Невозможно вернуть, монета еще не помещена");
    }

    @Override
    public void dispense() {
        System.out.println("Товар не выдан");
    }

    @Override
    public void pushSelectButton() {
        System.out.println("Выбранные товары отстутсвуют");
    }

    @Override
    public void refill() {
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }

    public String toString() {
        return "Товары распроданы";
    }
}
