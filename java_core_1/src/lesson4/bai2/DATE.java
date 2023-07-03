package lesson4.bai2;
import java.util.Scanner;
public class DATE {
    private int day;
    private int month;
    private int year;

    public DATE(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public DATE() {
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        day = sc.nextInt();
        System.out.println("Nhap thang: ");
        month = sc.nextInt();
        System.out.println("Nhap nam");
        year = sc.nextInt();
    }

    public String Xuat() {
        return day + "/" + month + "/" + year;

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
