package lesson2;
import java.util.Scanner;
public class exercise1 {
    public static int max(int a, int b, int c)
    {
        int max_value = a;
        if (max_value < b)
        {
            max_value = b;
        }
        if (max_value < c)
        {
            max_value = c;
        }

        return max_value;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(max(a, b, c));
    }






}
