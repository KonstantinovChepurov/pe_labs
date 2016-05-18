package asu.cars;

import java.util.ArrayList;


public class CarDealership {
	private ArrayList<SalableVehicle> carLot;  
	private String name; 

	public CarDealership() {
		carLot = new ArrayList<SalableVehicle>();
		name = null;
	}

	public CarDealership(String name) {
		carLot = new ArrayList<SalableVehicle>();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCar(SalableVehicle c) {
		carLot.add(c);
	}

	public void showCars() {
		System.out.println("Autosalon " + name + ", there are:");
		for (SalableVehicle c : carLot) {
			System.out.println(c);
		}
	}

        public SalableVehicle findCar(String vin) throws NoSuchCarException {
 	    for (SalableVehicle c : carLot) {
	        if (c.getVin().equals(vin)) {
                    return c;
                }
	    }
            throw new NoSuchCarException("Ошибка: нет автомобиля с таким VIN");
        }

        public void sellCar(String vin) throws NoSuchCarException {
 	    for (SalableVehicle c : carLot) {
	        if (c.getVin().equals(vin)) {
                    carLot.remove(c);
                    return;
                }
	    }
 	    	throw new NoSuchCarException("Ошибка: нет автомобиля с таким VIN");
        }

	public static void main(String argv[]) throws NoSuchCarException {
		CarDealership carDealership = new CarDealership("New");

		SalableVehicle lada = new SalableCarAdapter("44444", 50, 20000, "lada", "red", 1998);
		SalableVehicle bmw = new SalableCarAdapter("5555", 100, 1500000, "bmw", "blue", 2007);
		carDealership.addCar(lada);
		carDealership.addCar(bmw);

		carDealership.showCars();
	}
}
