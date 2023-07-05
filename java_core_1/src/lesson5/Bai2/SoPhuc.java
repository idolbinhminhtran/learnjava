package lesson5.Bai2;
import java.util.*;
public class SoPhuc {
    private int thuc;
    private int ao;

    public SoPhuc(int thuc, int ao)
    {
        this.thuc = thuc;
        this.ao = ao;
    }

    public SoPhuc()
    {

    }

    public int getThuc() {
        return thuc;
    }

    public void setThuc(int thuc) {
        this.thuc = thuc;
    }

    public int getAo() {
        return ao;
    }

    public void setAo(int ao) {
        this.ao = ao;
    }

    public void Nhap()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap phan thuc");
        thuc = input.nextInt();
        System.out.println("Nhap phan ao");
        ao = input.nextInt();
    }

    public void Xuat()
    {
        System.out.printf("So phuc: %d + %di", thuc, ao);
    }

    public SoPhuc Cong(SoPhuc sp2)
    {
        int thucMoi = thuc + sp2.thuc;
        int aoMoi = ao + sp2.ao;
        return new SoPhuc(thucMoi, aoMoi);
    }

    public SoPhuc Tru(SoPhuc sp2)
    {
        int thucMoi = thuc - sp2.thuc;
        int aoMoi = ao - sp2.ao;
        return new SoPhuc(thucMoi, aoMoi);
    }

}
