package lesson4.bai4;
import java.util.Arrays;
import java.util.Scanner;
public class PHONGMAY {
    private String Maphong;
    private String Tenphong;
    private int Dientich;
    private QUANLY x;
    private MAY y[];
    private int n;

    public PHONGMAY(String maphong, String tenphong, int dientich, QUANLY x, MAY[] y, int n) {
        Maphong = maphong;
        Tenphong = tenphong;
        Dientich = dientich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public PHONGMAY(){

    }

    public String getMaphong() {
        return Maphong;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phong: ");
        Maphong = sc.nextLine();
        System.out.println("Nhap ten phong: ");
        Tenphong = sc.nextLine();
        System.out.println("Nhap dien tich");
        Dientich = sc.nextInt();
        System.out.println("Nhap thong tin quan ly: ");
        x.Nhap();
        System.out.println("Nhap so luong may: ");
        n = sc.nextInt();
        y = new MAY[n];
        for(int i = 0; i < n; i ++){
            MAY Maymoi = new MAY();
            Maymoi.Nhap();
            y[i] = Maymoi;
        }
    }

    public String Xuat() {
        return "PHONGMAY{" +
                "Maphong='" + Maphong + '\'' +
                ", Tenphong='" + Tenphong + '\'' +
                ", Dientich=" + Dientich +
                ", x=" + x +
                ", y=" + Arrays.toString(y) +
                ", n=" + n +
                '}';
    }

    public void setMaphong(String maphong) {
        Maphong = maphong;
    }

    public String getTenphong() {
        return Tenphong;
    }

    public void setTenphong(String tenphong) {
        Tenphong = tenphong;
    }

    public int getDientich() {
        return Dientich;
    }

    public void setDientich(int dientich) {
        Dientich = dientich;
    }

    public QUANLY getX() {
        return x;
    }

    public void setX(QUANLY x) {
        this.x = x;
    }

    public MAY[] getY() {
        return y;
    }

    public void setY(MAY[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

}
