package learn_oop;

public class Car
{
    private String code;
    private  String brand;
    private String manufacturer;
    private String shape;
    private int price;
    private String origin;

    public Car(String code, String brand, String manufacturer, String shape, int price, String origin) {
        this.code = code;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.shape = shape;
        this.price = price;
        this.origin = origin;
    }
    public Car() {

    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}