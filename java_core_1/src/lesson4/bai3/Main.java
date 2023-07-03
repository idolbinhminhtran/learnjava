package lesson4.bai3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PHIEU phieuMoi = new PHIEU();
        phieuMoi.Nhap();
        phieuMoi.Xuat();

        int tongTien = 0;

        for(int i = 0; i < phieuMoi.getN(); i++)
        {
            HANG[] arr = phieuMoi.getX();
            tongTien += arr[i].getDongia();
        }
        System.out.println("Tong gia: " + tongTien);
    }
}
