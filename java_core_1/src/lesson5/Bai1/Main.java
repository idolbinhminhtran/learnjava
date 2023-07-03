package lesson5.Bai1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        ArrayList<DieuHoa> dieuhoa = new ArrayList<DieuHoa>();
        for (int i = 0; i < n; i++) {
            DieuHoa motdieuhoa = new DieuHoa();
            motdieuhoa.Nhap();
            dieuhoa.add(motdieuhoa);
        }



        double minprice = dieuhoa.get(0).getGiaBan();
        for(int i = 0; i < dieuhoa.size(); i++)
        {

            System.out.println(dieuhoa.get(i).Xuat());
            if (minprice > dieuhoa.get(i).getGiaBan())
            {
                minprice = dieuhoa.get(i).getGiaBan();
            }
        }

        for(int i = 0; i < dieuhoa.size(); i++)
        {
            if (dieuhoa.get(i).getHangSanXuat().equals("Electrolux") && dieuhoa.get(i).getGiaBan() == minprice)
            {
                System.out.println(dieuhoa.get(i).Xuat());
            }
        }

    }
}
