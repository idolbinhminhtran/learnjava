package lesson2;
import java.util.Scanner;

public class exercise3 {
    public static boolean isNumeric(char character)
    {
        int ascii = character;
        if (48 < ascii && ascii < 57)
        {
            return true;
        }

        return false;






    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int total = 0;
        boolean check = false;

        for(int i = 0; i < s.length() ; i++)
        {
            char c = s.charAt(i);
            if(isNumeric(c) == true)
            {
                check = true;
                int num = (int) c - 48;
                total += num;

            }

        }

        System.out.println(check);
        System.out.println(total);


    }
}
