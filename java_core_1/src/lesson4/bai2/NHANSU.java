package lesson4.bai2;
import lesson4.bai2.DATE;

import java.util.Scanner;

public class NHANSU {
    private String maNhanSu;
    private String hoTen;
    private DATE ns;

    public NHANSU(String maNhanSu, String hoTen, DATE ns) {
        this.maNhanSu = maNhanSu;
        this.hoTen = hoTen;
        this.ns = ns;
    }

    public NHANSU() {
        this.ns = new DATE();

    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan su: ");
        maNhanSu = sc.nextLine();
        System.out.println("Nhap ho ten");
        hoTen = sc.nextLine();
        ns.Nhap();

    }


    public String Xuat() {
        return "NHANSU{" +
                "maNhanSu='" + maNhanSu + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ns=" + ns.Xuat() +
                '}';
    }

    public String getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(String maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public DATE getNs() {
        return ns;
    }

    public void setNs(DATE ns) {
        this.ns = ns;
    }
}
