package lesson4.bai4;
import java.util.Scanner;
public class QUANLY {
    private String Maql;
    private String Hoten;

    public QUANLY(String magl, String hoten) {
        Maql = magl;
        Hoten = hoten;
    }

    public QUANLY(){

    }

    public String getMagl() {
        return Maql;
    }

    public void setMagl(String magl) {
        Maql = magl;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma gl: ");
        Maql = sc.nextLine();
        System.out.println("Nhap ho va ten: ");
        Hoten = sc.nextLine();
    }

    public String Xuat() {
        return "QUANLY{" +
                "Maql='" + Maql + '\'' +
                ", Hoten='" + Hoten + '\'' +
                '}';
    }

}
