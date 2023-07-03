package lesson2;
import java.util.Scanner;

public class exercise2 {
    public static void enter_array(int n, int nums[])
    {
        for(int i = 0; i < n; i++)
        {
            Scanner sc = new Scanner(System.in);
            int number_enter = sc.nextInt();
            nums[i] = number_enter;
        }
    }

    public static void show_array(int i, int n, int nums[])
    {
        for(i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int add_elements(int n, int nums[])
    {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        int num_enter = sc.nextInt();
        for(int i = n; i > pos; i--)
        {
            nums[i] = nums[i - 1];
        }
        nums[pos] = num_enter;

        return n + 1;

    }

    public static int delete_elements(int n, int nums[])
    {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        for(int i = pos; i < n; i ++)
        {
            nums[i] = nums[i + 1];
        }

        return n - 1;


    }

    public static void reverse(int n, int nums[])
    {
        for(int i = n - 1; i >= 0; i --)
        {
            System.out.print(nums[i]);
            System.out.print(" ");
        }

    }

    public static boolean is_prime(int x)
    {
        if (x <= 1)
        {
            return false;
        }
        else {
            for(int i = 2; i <= Math.sqrt(x); i ++)
            {
                if (x % i == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void divisible(int n, int nums[])
    {
        System.out.println(nums[1]);
        for(int i = 0; i < n; i++)
        {
            if (nums[i]  % nums[1] == 0 && i != 1)
            {
                System.out.print(nums[i]);
                System.out.print(" ");
            }
        }

    }

    public static void print_sum_primes(int n, int nums[])
    {
        int total = 0;
        for(int i = 0; i < n; i++)
        {
            if(is_prime(nums[i]) == true)
            {
                total += nums[i];
            }

        }
        System.out.println(total);

    }








    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        enter_array(n, arr);
        //n = add_elements(n, arr);
        //n = delete_elements(n, arr);
        //reverse(n, arr);
//        for(int i = 0; i < n; i++)
//        {
//            System.out.print(arr[i]);
//            System.out.print(" ");
//
//        }
        //divisible(n, arr);
        print_sum_primes(n, arr);
    }


}
