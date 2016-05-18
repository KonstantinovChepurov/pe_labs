package asu.state;

public class NoCoinState implements State {

	VendingMachine vendingMachine;

	public NoCoinState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Вы поместили монету");
		vendingMachine.setState(vendingMachine.getHasCoinState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Вы не поместили монету");
	}

	@Override
	public void dispense() {
		System.out.println("Сперва необходимо произвести оплату");
	}

	@Override
	public void pushSelectButton() {
		System.out.println("Вы пытаетесь выбрать товар, не поместив монету");
//		vendingMachine.setState(vendingMachine.brokenState);
	}

	@Override
	public void refill() {

	}

	public String toString() {
		return "ожидание монеты";
	}

}
