package lesson5.Bai3;
import  java.util.*;
public class DateTime
{
    private String Ngay;
    private String Thang;
    private String Nam;

    public DateTime(String ngay, String thang, String nam)
    {
        Ngay = ngay;
        Thang = thang;
        Nam = nam;
    }

    public DateTime()
    {

    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String ngay) {
        Ngay = ngay;
    }

    public String getThang() {
        return Thang;
    }

    public void setThang(String thang) {
        Thang = thang;
    }

    public String getNam() {
        return Nam;
    }

    public void setNam(String nam) {
        Nam = nam;
    }

    public void InputDate()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        Ngay = input.nextLine();
        System.out.println("Nhap thang: ");
        Thang = input.nextLine();
        System.out.println("Nhap nam: ");
        Nam = input.nextLine();
    }

    public void OutputDate()
    {
        System.out.printf("%s/%s/%s", Ngay, Thang, Nam);
    }

}
