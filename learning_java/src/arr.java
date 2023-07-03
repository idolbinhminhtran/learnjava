import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class arr
{
    public static void main(String[] args)
    {
       int[] list = new int[100];
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i = 0;i < n; i++)
       {
           list[i] = sc.nextInt();
       }

       int a = sc.nextInt();
       int pos = -1;
       for(int i = 0; i < n; i ++)
       {
           if (a > list[i])
           {
               pos = i;
               break;
           }
           else
           {
               pos = n;
           }
       }
       for (int j = n; j > pos; j --)
       {
           list[j] = list[j - 1];
       }
       list[pos] = a;
       for(int i = 0; i <=n; i++)
       {
           System.out.print(list[i] + " ");
       }




    }
}
