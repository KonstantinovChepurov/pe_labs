package asu.state;

public class VendingMachine {

	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;
	State brokenState;

	State state;

	int count = 0;


  
	public VendingMachine(int count) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);
		brokenState = new BrokenState(this);

		this.count = count;
		if (count > 0) {
			state = noCoinState;
		} else {
			state = soldOutState;
		}
	}
  
	public void insertCoin() {
		state.insertQuarter();
	}

	public void ejectCoin() {
		state.ejectQuarter();
	}
 

	public void pushSelectButton() {
		state.pushSelectButton();
		state.dispense();

	}

	public void giveGood() {
		System.out.println("Товар выдается...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public void dispense() {
		soldState.dispense();
		soldOutState.dispense();
		noCoinState.dispense();
		soldOutState.dispense();
		hasCoinState.dispense();
	}

	public void refill(int numOfProducts) {
		this.count = numOfProducts;
		state.refill();
	}

	public String toString() {


		StringBuffer result = new StringBuffer();
		result.append("\nТоварный автомат ");
		result.append("В наличии: " + count + " товаров");
		result.append("\nСостояние: ");
		if (count != 1) {
			result.append(state);
		}
		result.append("\n");
//		result.append("Состояние: " + state + "\n");
		return result.toString();
	}

	public State getState() {
		return state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoCoinState() {
		return noCoinState;
	}

	public void setNoCoinState(State noCoinState) {
		this.noCoinState = noCoinState;
	}

	public State getHasCoinState() {
		return hasCoinState;
	}

	public void setHasCoinState(State hasCoinState) {
		this.hasCoinState = hasCoinState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getBrokenState() {
		return brokenState;
	}

	public void setBrokenState(State brokenState) {
		this.brokenState = brokenState;
	}
}


