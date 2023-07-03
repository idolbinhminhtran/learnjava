//package lesson5;
//import java.util.Scanner;
//import java.util.ArrayList;
//public class Main {
//    public class DieuHoa extends SanPham {
//        private int power;
//        private int price;
//
//        public DieuHoa(String code, String name, String manufacturer, String day, String date, int power, int price) {
//            super(code, name, manufacturer, day, date);
//            this.power = power;
//            this.price = price;
//        }
//
//
//        public DieuHoa() {
//
//        }
//
//        public int getPower() {
//            return power;
//        }
//
//        public int getPrice() {
//            return price;
//        }
//
//        public void setPower(int power) {
//            this.power = power;
//        }
//
//        public void setPrice(int price) {
//            this.price = price;
//        }
//
//        @Override
//        public void Input() {
//            super.Input();
//
//            Scanner sc = new Scanner(System.in);
//            this.power = sc.nextInt();
//            this.price = sc.nextInt();
//
//        }
//
//        public void Output() {
//            super.Output();
//
//            System.out.println("Power of product: ");
//            System.out.println("Price of product: ");
//        }
//
//
//    }
//}
//
//public static void main(String[] args) {
//    ArrayList<DieuHoa> DanhSachDieuHoa = new ArrayList<>();
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    for (int i = 0; i < n; i++) {
//        System.out.println("Nhap thong tin san pham thu: " + (i + 1));
//        DieuHoa dieuhoa = new DieuHoa();
//        dieuhoa.Input();
//        DanhSachDieuHoa.add(dieuhoa);
//    }
//
//    boolean CheckExist = false;
//    float MinPrice = 0;
//    for (int i = 0; i < n; i++) {
//        if (DanhSachDieuHoa.get(i).getPrice() <= MinPrice) {
//            MinPrice = DanhSachDieuHoa.get(i).getPrice();
//        }
//        if (DanhSachDieuHoa.get(i).getName() == "Electrolux") {
//            DanhSachDieuHoa.get(i).Output();
//            CheckExist = true;
//        }
//    }
//    System.out.println("Min price of Electrolux is: ");
//
//    if (CheckExist == false) {
//        System.out.println("Do not exist");
//    }
//
//}
//
//
