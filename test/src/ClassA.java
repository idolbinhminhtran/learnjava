public class ClassA {
    public int x;
    public static void value(int v){
        x = v;
    }

    public static void main(String[] args) {
        ClassA.value(2);
        System.out.println(ClassA.x);

        ClassA obj = new ClassA();
        obj.value(3);
        System.out.println(obj.x);
    }
}
