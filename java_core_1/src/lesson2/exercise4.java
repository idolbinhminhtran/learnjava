package lesson2;
import java.util.Scanner;
public class exercise4 {
    public static boolean isNumeric(char character) {
        int ascii = character;
        if (48 < ascii && ascii < 57) {
            return true;
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //xoa khoang trang hai dau
        String s_modify1 = s.trim();
        //moi mot tu cach nhau boi mot khoang trang duy nhat
        String s_modify2 = s_modify1.replaceAll("\\s+", " ");
        //xoa so
        String s_modify3 = "" ;
        for(int i = 0; i < s_modify2.length(); i++)
        {
            char c = s_modify2.charAt(i);
            if (isNumeric(c) == true)
            {
                s_modify3 = s_modify2.replace("c","");
            }
        }
        //viet hoa ki tu dau
        String s_modify4 = s_modify3.substring(0, 1).toUpperCase() + s_modify3.substring(1);

        System.out.println(s_modify4);







    }
}
