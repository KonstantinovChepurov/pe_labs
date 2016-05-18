package asu.cars;


public abstract class SalableVehicle {
    protected String vin; 
    protected int mileage; 
    protected int price; 

    public SalableVehicle(String vin, int mileage, int price) {
        this.vin = vin;
        this.mileage = mileage;
        this.price = price; 
    }

    public String getVin() {
        return vin;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    public abstract String getMakeAndModel();

    public abstract String getColor();

    public abstract int getYear();

    public abstract String toString();
}
