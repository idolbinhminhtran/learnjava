package lesson5.Bai1;
import java.util.*;
public class DieuHoa extends SanPham {
    private int congSuat;
    private double giaBan;

    public DieuHoa(String maSanPham, String tenSanPham, String hangSanXuat, String ngayNhap, int congSuat, double giaBan) {
        super(maSanPham, tenSanPham, hangSanXuat, ngayNhap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public DieuHoa() {
        super();
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void Nhap()
    {
        super.Nhap();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap cong suat: ");
        congSuat = input.nextInt();
        System.out.println("Nhap gia ban: ");
        giaBan = input.nextInt();
    }

    public String Xuat() {
        return  "DieuHoa{" + super.Xuat() +
                "congSuat=" + congSuat +
                ", giaBan=" + giaBan +
                '}';
    }
}
