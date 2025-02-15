

public class Car {
    private String model;
    private String color;
    int price;

    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    // Gettter Methods
    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    // Setter Methods
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}