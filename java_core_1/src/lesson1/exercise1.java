package lesson1;

import java.sql.SQLOutput;
import java.util.Scanner;


public class exercise1 {
    public static void main(String[] args)
    {
        System.out.println("Nhap vao 3 so a, b, c: ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        if (a == 0)
        {
            if (b != 0)
            {
                float x = - c / b;
                System.out.println("Phuong trinh co nghiem duy nhat: " + x);
            }
            else
            {
                System.out.println("Phuong trinh co vo so nghiem: ");
            }

        }
        else
        {
            float delta = b * b - 4 * a * c;

            if (delta > 0)
            {
                double x1 = (- b + Math.sqrt(delta))/ (2 * a);
                double x2 = (- b - Math.sqrt(delta))/ (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet " + x1 + " " +  x2);
            }
            else if (delta == 0)
            {
                double x = (- b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: " + x);
            }
            else
            {
                double x = - b / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phuc: " + x + "+" + delta + "i" + " " + x + "+" + (-delta) + "i");

            }


        }



    }
}
