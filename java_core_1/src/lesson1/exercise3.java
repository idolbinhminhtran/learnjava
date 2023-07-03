package lesson1;
import java.util.Scanner;
public class exercise3 {
    public static int factorial(int n)
    {
        int total = 1;
        for(int i = 1; i <= n; i++)
        {
            total *= i;
        }
        return total;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int C = factorial(n) / (factorial(m) * factorial(n - m));
        System.out.println("The result is: " + C);

    }

}
