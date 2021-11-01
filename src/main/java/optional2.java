import java.util.Scanner;
import java.util.Random;
import java.util.*;

class colItemsInfo {
    Integer index;
    Integer value;
}

public class optional2 {
    public static void main(String[] args) {
        Integer[][] matrix = createMatrix();

        Scanner sc = new Scanner(System.in);
        System.out.println("k-ый столбец");
        Integer k = sc.nextInt();

        colItemsInfo[] colItems = new colItemsInfo[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            colItemsInfo item = new colItemsInfo();
            item.index = i;
            item.value = matrix[i][k];

            colItems[i] = item;
        }

        Arrays.sort(colItems, Comparator.comparingInt(a -> a.value));

        Integer[][] matrixSorted = new Integer[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            matrixSorted[i] = matrix[colItems[i].index];
        }

        printMatrix(matrixSorted);
    }

    public static Integer[][] createMatrix() {
        Scanner sc = new Scanner(System.in);
        Random rr = new Random();
        System.out.println("matrix dimension");
        Integer n = sc.nextInt();
        System.out.println("M");
        Integer M = sc.nextInt();

        Integer[][] matrix = new Integer[n][n];

        for (Integer i = 0; i < matrix.length; i++) {
            for (Integer j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rr.nextInt(M) - rr.nextInt(M);
            }
        }

        printMatrix(matrix);

        return matrix;
    }

    public static void printMatrix(Integer[][] matrix) {
        for (Integer i = 0; i < matrix.length; i++) {
            for (Integer j = 0; j < matrix[i].length; j++) {
                if (j + 1 == matrix[i].length) {
                    System.out.println(matrix[i][j]);
                } else {
                    System.out.printf("%s | ", matrix[i][j]);
                }
            }
        }
    }
}