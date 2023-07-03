package BAI2;
import java.util.Scanner;
public class Main {

    public static float[] floatToIntArray(String matrix){
        String[] matrixArray = matrix.split(" ");
        float[] matrixFloatArray = new float[matrixArray.length];
        for (int i = 0; i < matrixFloatArray.length; i ++){
            matrixFloatArray[i] = Float.parseFloat(matrixArray[i]);
        }

        return matrixFloatArray;
    }

    public static float[][] convertTo2D(float [] matrix){
        float[][] matrix2D = new float[3][3];
        int index = 0;
        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j ++){
                matrix2D[i][j] = matrix[index];
                index++;
            }
        }

        return matrix2D;
    }

    public static String convertToString (float[][] matrix){
        String string2D = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                string2D = string2D + Math.round(matrix[i][j] * 10.0f)/10.0f + " ";
            }
            if (i <= 1)
            {
                string2D = string2D + "\n";
            }
        }

        return string2D;
    }
    public static float rowColumnMultiplication(float[] row1, float[] row2){
        float unit = 0;
        for(int i = 0; i < 3; i++){
            unit = unit + row1[i] * row2[i];
        }

        return unit;
    }
    public static float[][] matrixMultiplication(float[][] matrix1, float[][] matrix2){
        float[] matrix1D = new float[9];
        int index = 0;
        for(int i = 0; i < 3; i++){
            float [] row = matrix1[i];
            for(int j = 0; j < 3; j++){
                float[] column = {matrix2[0][j], matrix2[1][j], matrix2[2][j]};
                matrix1D[index] = rowColumnMultiplication(row, column);
                if (index < 9) {
                    index++;
                }
                else
                {
                    break;
                }
            }
        }

        return convertTo2D(matrix1D);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matrix1 = sc.nextLine();
        String matrix2 = sc.nextLine();
        float [][] matrix1Array = convertTo2D(floatToIntArray(matrix1));
        float [][] matrix2Array = convertTo2D(floatToIntArray(matrix2));
        System.out.println("The multiplication of the matrices is: ");
        float[][] multiplicatedMatrix = matrixMultiplication(matrix1Array, matrix2Array);
        String output = convertToString(matrix1Array) + " * " + convertToString(matrix2Array) + " = " + convertToString(multiplicatedMatrix);
        System.out.print(output);









    }

}
