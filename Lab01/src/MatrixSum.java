import java.util.Scanner;

public class MatrixSum {

    static int[][] readMat(String ch, int n, Scanner sc) {
        int[][] mat = new int[n][n];
        System.out.println("Ma trận "+ ch);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("A[" + (i+1) + "]" + "[" + (j+1) + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }

    static int[][] addMat(int[][] matA, int[][] matB, int n) {
        int[][] matC = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }
        return matC;
    }

    static void dispMat(int[][] mat, String ch, int n) {
        System.out.println("Ma trận "+ ch);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước ma trận: ");
        int n = sc.nextInt();
        int[][] matA = readMat("A", n, sc);
        int[][] matB = readMat("B", n, sc);
        dispMat(matA, "A", n);
        dispMat(matB, "B", n);
        dispMat((addMat(matA,matB,n)), "A+B", n);
    }
}
