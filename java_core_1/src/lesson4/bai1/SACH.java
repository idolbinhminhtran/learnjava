package lesson4.bai1;
import java.util.Scanner;
public class SACH {
    private String maSach;
    private String tenSach;
    private String nxb;
    private int soTrang;
    private float giaTien;

    public SACH(String maSach, String tenSach, String nxb, int soTrang, float giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nxb = nxb;
        this.soTrang = soTrang;
        this.giaTien = giaTien;
    }

    public SACH() {
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.println("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.println("Nhap nha xuat ban");
        nxb = sc.next();
        System.out.println("Nhap so trang");
        soTrang = sc.nextInt();
        System.out.println("Nhap gia tien");
        giaTien = sc.nextInt();

    }

    public String Xuat() {
        return "SACH{" +
                "maSach='" + maSach + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", nxb='" + nxb + '\'' +
                ", soTrang=" + soTrang +
                ", giaTien=" + giaTien +
                '}';
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }
}

