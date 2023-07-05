package lesson5.Bai2;

public class Main
{
    public static void main(String[] args) {
        SoPhuc p1 = new SoPhuc();
        p1.Nhap();
        SoPhuc p2 = new SoPhuc();
        p2.Nhap();
        SoPhuc pHieu = p1.Tru(p2);
        SoPhuc pTong = p1.Cong(p2);
        pHieu.Xuat();
        pTong.Xuat();

    }
}
