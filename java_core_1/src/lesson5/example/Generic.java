package lesson5.example;

public class Generic {
    public static void main(String[] args) {
        Numbers<Integer> a = new Numbers<Integer>(2);
        System.out.println(a.getNumber());

        }
}

