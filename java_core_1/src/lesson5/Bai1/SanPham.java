package lesson5.Bai1;
import java.util.*;
public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private String ngayNhap;

    public SanPham(String maSanPham, String tenSanPham, String hangSanXuat, String ngayNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.ngayNhap = ngayNhap;
    }

    public SanPham(){

    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void Nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        maSanPham = input.nextLine();
        System.out.println("Nhap ten san pham: ");
        tenSanPham = input.nextLine();
        System.out.println("Nhap hang san xuat: ");
        hangSanXuat = input.nextLine();
        System.out.println("Nhap ngay nhap: ");
        ngayNhap = input.nextLine();
    }

    public String Xuat() {
        return "SanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                '}';
    }
}
