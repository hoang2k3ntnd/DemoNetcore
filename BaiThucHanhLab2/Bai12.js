import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap kich thuoc ma tran
        System.out.print("Nhap so hang cua ma tran: ");
        int m = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int n = sc.nextInt();

        // Nhap gia tri ma tran
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap phan tu [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Tim phan tu lon nhat
        int max = matrix[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        // Hien thi ra man hinh 
        System.out.println("Phan tu lon nhat trong ma tran la: " + max);
    }
}