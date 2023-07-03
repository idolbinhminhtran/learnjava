import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int[] arr = new int[100];
        System.out.println("Nhap n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int total = 0;
        for(int i = 0;i < n; i++)
        {
            total += arr[i];
        }

        System.out.println(total);
    }
}