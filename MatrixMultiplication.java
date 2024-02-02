import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix A
        System.out.println("Enter the dimensions of matrix A:");
        System.out.print("Rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Columns (n): ");
        int n = scanner.nextInt();

        int[][] matrixA = new int[m][n];
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Input matrix B
        System.out.println("Enter the dimensions of matrix B:");
        System.out.print("Rows (n): ");
        int p = scanner.nextInt();
        System.out.print("Columns (q): ");
        int q = scanner.nextInt();

        if (n != p) {
            System.out.println("Matrix multiplication is not possible. Number of columns in A must be equal to the number of rows in B.");
            return;
        }

        int[][] matrixB = new int[p][q];
        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix multiplication
        int[][] resultMatrix = new int[m][q];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Display the result matrix
        System.out.println("Resultant Matrix (A * B):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}