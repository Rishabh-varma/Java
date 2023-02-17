import java.util.Scanner;

public class javatut13_6 {
    public static void main(String[] args) {
        int matrix1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int mat[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key2=33;
        int matrix[][] = new int[3][3];
        int key = 10;
        int n = matrix.length;
        int m = matrix[0].length;
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // matrix[i][j] = sc.nextInt();
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }
        search(matrix, key, n, m);
        printspiral(matrix);
        System.out.println(diagonal_sum(matrix1));
        System.out.println(staircasesearch(mat, key2));
    }

    public static void search(int matrix[][], int key, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at cell(" + i + "," + j + ")");
                }
            }
        }
    }

    public static void printspiral(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            // bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startcol == endcol) {
                    return;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }

    public static int diagonal_sum(int matrix1[][]) {
        int sum = 0;
        // for (int i = 0; i < matrix1.length; i++) {
        // for (int j = 0; j < matrix1.length; j++) {
        // if (i == j) {
        // sum += matrix1[i][j];
        // } else if (i + j == matrix1.length - 1) {
        // sum += matrix1[i][j];
        // }

        // }

        // }
        for (int i = 0; i < matrix1.length; i++) {
            // pd
            sum += matrix1[i][i];
            // sd
            if (i != matrix1.length - 1 - i)
                sum += matrix1[i][matrix1.length - i - 1];

        }
        return sum;
    }
     public static boolean staircasesearch(int mat[][],int key2){
         int row=0,col=mat[0].length-1;
         while (row <mat.length && col>=0){
            if (mat[row][col]==key2){
                System.out.print("found at ("+row+","+col+")");
                return true;
            }
            else if (key2<mat[row][col]){
                col--;
            }
            else{
                row++;
            }
         }
         System.out.println();
         return false;
     }

}
