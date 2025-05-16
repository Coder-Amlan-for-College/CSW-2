package Assignment_8;
import java.util.Scanner;

class MatrixMultiplicationThread extends Thread {
    private int[][] matrixA;
    private int[][] matrixB;
    private int[][] result;
    private int rowIndex;
    private int numColumns;

    public MatrixMultiplicationThread(int[][] matrixA, int[][] matrixB, int[][] result, int rowIndex, int numColumns) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.result = result;
        this.rowIndex = rowIndex;
        this.numColumns = numColumns;
    }

    @Override
    public void run() {
        for (int i = 0; i < numColumns; i++) {
            result[rowIndex][i] = 0;
            for (int j = 0; j < matrixB.length; j++) {
                result[rowIndex][i] += matrixA[rowIndex][j] * matrixB[j][i];
            }
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for Matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter the number of columns for Matrix A: ");
        int colsA = sc.nextInt();
        System.out.print("Enter the number of rows for Matrix B: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter the number of columns for Matrix B: ");
        int colsB = sc.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible: Columns of Matrix A must equal Rows of Matrix B.");
            return;
        }

        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];

        System.out.println("Enter the elements of Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        MatrixMultiplicationThread[] threads = new MatrixMultiplicationThread[rowsA];
        for (int i = 0; i < rowsA; i++) {
            threads[i] = new MatrixMultiplicationThread(matrixA, matrixB, result, i, colsB);
            threads[i].start();
        }

        try {
            for (int i = 0; i < rowsA; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread execution interrupted.");
        }

        System.out.println("Resultant Matrix after multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}