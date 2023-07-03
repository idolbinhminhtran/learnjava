package lesson4.bai4;
import java.util.Scanner;
public class MAY {
    private String Mamay;
    private String Kieumay;
    private String Tinhtrang;

    public MAY(String mamay, String kieumay, String tinhtrang) {
        Mamay = mamay;
        Kieumay = kieumay;
        Tinhtrang = tinhtrang;
    }

    public MAY() {

    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma may: ");
        Mamay = sc.nextLine();
        System.out.println("Nhap kieu may");
        Kieumay = sc.nextLine();
        System.out.println("Nhap tinh trang: ");
        Tinhtrang = sc.nextLine();
    }

    public String Xuat() {
        return "MAY{" +
                "Mamay='" + Mamay + '\'' +
                ", Kieumay='" + Kieumay + '\'' +
                ", Tinhtrang='" + Tinhtrang + '\'' +
                '}';
    }

    public String getMamay() {
        return Mamay;
    }

    public void setMamay(String mamay) {
        Mamay = mamay;
    }

    public String getKieumay() {
        return Kieumay;
    }

    public void setKieumay(String kieumay) {
        Kieumay = kieumay;
    }

    public String getTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        Tinhtrang = tinhtrang;
    }
}
