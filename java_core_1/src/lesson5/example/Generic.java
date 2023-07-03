package lesson5.example;

public class Generic {
    public static void main(String[] args) {
        Numbers<Integer> a = new Numbers<Integer>("DCMM");
        System.out.println(a.getNumber());

        }
}

