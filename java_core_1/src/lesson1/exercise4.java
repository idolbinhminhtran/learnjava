package lesson1;
import java.util.Scanner;
class ScannerScannerexercise4 {
    public static int findGCM(int n, int m)
    {
        if (m == 0)
            return n;
        return findGCM(m, n % m);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(findGCM(n, m));

    }

}
