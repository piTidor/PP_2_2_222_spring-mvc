package web.model;

public class Car {
    private String model;
    private int namber;
    private String vin;

    public Car(String model, int namber, String vin) {
        this.model = model;
        this.namber = namber;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNamber() {
        return namber;
    }

    public void setNamber(int namber) {
        this.namber = namber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", namber=" + namber +
                ", vin='" + vin + '\'' +
                '}';
    }
}
