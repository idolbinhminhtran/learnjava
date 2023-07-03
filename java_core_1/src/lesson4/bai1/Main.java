package lesson4.bai1;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SACH> sachs = new ArrayList<SACH>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            SACH quyenSach = new SACH();
            quyenSach.Nhap();
            sachs.add(quyenSach);
        }
        for(SACH i : sachs){
            System.out.println(i.Xuat());
        }

    }
}
