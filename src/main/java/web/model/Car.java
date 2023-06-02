package web.model;

public class Car {
    private String color;
    private String model;
    private int serias;

    public Car() {
    }
    public Car(String color, String model, int serias) {
        this.color = color;
        this.model = model;
        this.serias = serias;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerias() {
        return serias;
    }

    public void setSerias(int serias) {
        this.serias = serias;
    }
}
