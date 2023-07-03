public class Class8 {
    public static void main(String[] args) {
        int[] myArray = {8, 4, 1, 9, 6, 7, 3};
        int offset = 2;
        for(int index = 0; index < 4; ++ index) {
            System.out.println(myArray[(index + offset) % myArray.length] + " ");
            offset += 2;
        }
    }
}