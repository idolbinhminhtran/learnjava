package learn_oop;

public class Caculator {

    public static String total(int a, int b){
        return String.format("%d", a + b);
    }
    public static String total(double a, double b){
        return String.format("%.3f", a + b);
    }

    public static void main(String[] args) {
        Caculator casio = new Caculator();
        System.out.println("The sum of 6 and 9 is: " + casio.total(6 ,9));
        System.out.println("The sum of 6.1 and 9.5: " + casio.total(6.1, 9.2));
    }
}



