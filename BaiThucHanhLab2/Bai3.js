import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap Ten : ");
        String b = sc.nextLine();

        System.out.println("Nam sinh : ");
        int a = sc.nextInt();

        if (a < 16) {
            System.out.println("Ban " + b + " o tuoi vi thanh nien");
        } else if (a >= 16 && a < 18) {
            System.out.println("Ban " + b + " o tuoi truong thanh ");
        } else {
            System.out.println("Ban " + b + " da gia");
        }
    }
}
