package lesson4.bai3;
import java.util.Arrays;
import java.util.Scanner;
public class PHIEU {
    private String Maphieu;
    private HANG x[];
    private int n;

    public PHIEU(String maphieu, HANG[] x, int n) {
        Maphieu = maphieu;
        this.x = x;
        this.n = n;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phieu");
        Maphieu = sc.nextLine();
        System.out.println("Nhap so mat hang");
        n = sc.nextInt();
        x = new HANG[n];
        for(int i = 0; i < n; i++)
        {
            HANG hangDon = new HANG();
            hangDon.Nhap();
            x[i] = hangDon;
        }

    }

    public String Xuat() {
        return "PHIEU{" +
                "Maphieu='" + Maphieu + '\'' +
                ", x=" + Arrays.toString(x) +
                ", n=" + n +
                '}';
    }


    public PHIEU() {
    }

    public String getMaphieu() {
        return Maphieu;
    }

    public void setMaphieu(String maphieu) {
        Maphieu = maphieu;
    }

    public HANG[] getX() {
        return x;
    }

    public void setX(HANG[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
