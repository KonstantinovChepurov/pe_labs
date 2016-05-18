package asu.state;

public class VendingMachineTestDrive {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine(5);

		System.out.println(vendingMachine);

		vendingMachine.insertCoin();
		vendingMachine.pushSelectButton();

		System.out.println(vendingMachine);

		vendingMachine.insertCoin();
		vendingMachine.ejectCoin();
		vendingMachine.pushSelectButton();

		System.out.println(vendingMachine);

		vendingMachine.insertCoin();
		vendingMachine.pushSelectButton();
		vendingMachine.insertCoin();
		vendingMachine.pushSelectButton();
		vendingMachine.ejectCoin();

		System.out.println(vendingMachine);

		vendingMachine.insertCoin();
		vendingMachine.insertCoin();
		vendingMachine.pushSelectButton();
		vendingMachine.insertCoin();
		vendingMachine.pushSelectButton();
		vendingMachine.insertCoin();
		vendingMachine.pushSelectButton();

		System.out.println(vendingMachine);
	}
}
