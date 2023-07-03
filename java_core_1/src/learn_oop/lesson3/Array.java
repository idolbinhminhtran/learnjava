package learn_oop.lesson3;
import java.util.Scanner;

public class Array {
    private int n;
    private int arr[] ;


    public void inputData()
    {
        this.arr = new int[100];
        Scanner sc = new Scanner(System.in);
        this.n = sc.nextInt();
        for (int i = 0; i < this.n; i ++)
        {
            int num = sc.nextInt();
            this.arr[i] = num;
        }


    }

    public void Show()
    {
        System.out.println(this.n);
        for(int i = 0; i < this.n; i ++)
        {
            System.out.print(this.arr[i]);
            System.out.print(" ");
        }
    }

    public int Sum()
    {
        int total = 0;
        for(int i = 0; i < this.n; i++)
        {
            total += this.arr[i];
        }

        return total;
    }

    public int[] Filter(boolean flag)
    {
        int new_arr[];
        int j = 0;
        new_arr = new int[100];
        if (flag == true)
        {
            for(int i = 0; i < this.n; i ++)
            {
                if(this.arr[i] % 2 == 0)
                {
                    new_arr[j] = this.arr[i];
                    j ++;
                }
            }
        }
        else
        {
            for(int i = 0; i < this.n; i ++)
            {
                if(this.arr[i] % 2 != 0)
                {
                    new_arr[j] = this.arr[i];
                    j ++;
                }
            }
        }

        return new_arr;
    }

    public Array(int n, int[] arr) {
        this.n = n;
        this.arr = arr;
    }

    public Array()
    {

    }

    public int getN() {
        return n;
    }

    public int[] getArr() {
        return arr;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}

class RunMain
{
    public static void main(String[] args)
    {
        Array arr1 = new Array();
        arr1.inputData();


        Array arr2 = new Array();
        arr2.inputData();

        arr1.Show();
        arr2.Show();

        if (arr1.Sum() / arr1.getN() < arr2.Sum() / arr2.getN())
        {
            arr2.Show();
        }
        else if(arr1.Sum() / arr1.getN() > arr2.Sum() / arr2.getN())
        {
            arr1.Show();
        }
        else
        {
            System.out.println("Bye");

        }
    }


}

