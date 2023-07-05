package lesson5.Bai3;
import java.util.*;
public class PHIEU
{
    private String MaPhieu;
    private String TenPhieu;
    private DateTime a;
    private SANPHAM[] x;
    private int n;

    public PHIEU(String maPhieu, String tenPhieu, DateTime a, SANPHAM[] x, int n) {
        MaPhieu = maPhieu;
        TenPhieu = tenPhieu;
        this.a = a;
        this.x = x;
        this.n = n;
    }

    public PHIEU()
    {

    }

    public String getMaPhieu() {
        return MaPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        MaPhieu = maPhieu;
    }

    public String getTenPhieu() {
        return TenPhieu;
    }

    public void setTenPhieu(String tenPhieu) {
        TenPhieu = tenPhieu;
    }

    public DateTime getA() {
        return a;
    }

    public void setA(DateTime a) {
        this.a = a;
    }

    public SANPHAM[] getX() {
        return x;
    }

    public void setX(SANPHAM[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void InputPhieu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma phieu: ");
        MaPhieu = input.nextLine();
        System.out.println("Nhap ten phieu: ");
        TenPhieu = input.nextLine();
        System.out.println("Nhap thong tin ngay" );
        a = new DateTime();
        a.InputDate();
        System.out.println("Nhap so luong san pham: ");
        n = input.nextInt();
        x = new SANPHAM[n];
        for(int i = 0; i < x.length; i++)
        {
            SANPHAM motSanPham = new SANPHAM();
            motSanPham.InputSP();
            x[i] = motSanPham;
        }

    }

    public void OutputPhieu()
    {
        System.out.println("Ma phieu: " + MaPhieu);
        System.out.println("Ten phieu " + TenPhieu);
        System.out.println("Thong tin ngay cua phieu: ");
        a.OutputDate();
        System.out.println("Thong tin cua san pham");
        for(int i = 0; i< x.length; i++)
        {
            x[i].OutputSP();
            int thanhtien = x[i].getSoLuong() * x[i].getDonGia();
            System.out.println("Thanh tien: " + thanhtien);
        }

    }
}
