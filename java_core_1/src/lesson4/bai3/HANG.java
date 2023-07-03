package lesson4.bai3;
import java.util.Scanner;
public class HANG {
    private String MaHang;
    private String Tenhang;
    private int Dongia;

    public HANG(String maHang, String tenhang, int dongia) {
        MaHang = maHang;
        Tenhang = tenhang;
        Dongia = dongia;
    }

    public HANG() {
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang");
        MaHang = sc.nextLine();
        System.out.println("Nhap ten hang");
        Tenhang = sc.nextLine();
        System.out.println("Nhap don gia");
        Dongia = sc.nextInt();
    }


    public String Xuat() {
        return "HANG{" +
                "MaHang='" + MaHang + '\'' +
                ", Tenhang='" + Tenhang + '\'' +
                ", Dongia=" + Dongia +
                '}';
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String maHang) {
        MaHang = maHang;
    }

    public String getTenhang() {
        return Tenhang;
    }

    public void setTenhang(String tenhang) {
        Tenhang = tenhang;
    }

    public int getDongia() {
        return Dongia;
    }

    public void setDongia(int dongia) {
        Dongia = dongia;
    }
}
