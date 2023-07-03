package lesson5;
import java.util.Scanner;

public class SanPham {
    private String code;
    private String name;
    private String manufacturer;
    private String day;
    private String date;

    public SanPham(String code, String name, String manufacturer, String day, String date) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.day = day;
        this.date = date;
    }

    public SanPham() {
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDay() {
        return day;
    }

    public String getDate() {
        return date;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        this.code = sc.nextLine();
        this.name = sc.nextLine();
        this.manufacturer = sc.nextLine();
        this.day = sc.nextLine();
    }

    public void Output(){
        System.out.println("Code of product: " + this.code);
        System.out.println("Name of product: " + this.name);
        System.out.println("Name of manufacturer: " + this.manufacturer);
        System.out.println("Day of import: " + this.day);
    }







}


