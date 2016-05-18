package asu.cars;

public class SalableCarAdapter extends SalableVehicle {

    private Car car = new Car();
    private String model;
    private String color;
    private int year;

    public SalableCarAdapter(String vin, int mileage, int price, String model, String color, int year) {
        super(vin, mileage, price);
        this.model = model;
        this.color = color;
        this.year = year;
    }



    @Override
    public String getMakeAndModel() {
        return car.getModel();
    }

    @Override
    public String getColor() {
        return car.getColor();
    }

    @Override
    public int getYear() {
        return car.getYear();
    }

    @Override
    public String toString() {
        return "Model: " + model + " ,Vin number: " + vin + ", mileage:  " + mileage + " km," + " color: " + color + ", year: " + year + ", price: " + price;
    }



}
