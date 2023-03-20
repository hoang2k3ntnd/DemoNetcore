import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so nguyen bat ky ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.print("So nhap vao la so chan ");
        } else {
            System.out.print("So nhap vao la so le ");
        }
    }
}