package lesson5.Bai3;
import java.util.*;
public class SANPHAM
{
    private String MaSP;
    private String TenSP;
    private int SoLuong;
    private int DonGia;

    public SANPHAM(String maSP, String tenSP, int soLuong, int donGia) {
        MaSP = maSP;
        TenSP = tenSP;
        SoLuong = soLuong;
        DonGia = donGia;
    }

    public SANPHAM()
    {

    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String maSP) {
        MaSP = maSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int donGia) {
        DonGia = donGia;
    }

    public void InputSP()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        MaSP = input.nextLine();
        System.out.println("Nhap ten san pham: ");
        TenSP = input.nextLine();
        System.out.println("Nhap so luong: ");
        SoLuong = input.nextInt();
        System.out.println("Nhap don gia: ");
        DonGia = input.nextInt();

    }

    public void OutputSP()
    {
        System.out.println("Ma san pham: " + MaSP);
        System.out.println("Ten san pham: " + TenSP);
        System.out.println("So luong san pham: " + SoLuong);
        System.out.println("Don gia: " + DonGia);
    }
}
