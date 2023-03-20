import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
    float a, b;
    Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 2 so bat ky \n");
        a = sc.nextFloat();
        b = sc.nextFloat();

    float tong = a + b;
    float hieu = a - b;
    float tich = a * b;
    float thuong = a / b;
    float chiadu = a % b;

        System.out.printf("Tong hai so = %.2f", tong);
        System.out.printf("\nHieu hai so = %.2f", hieu);
        System.out.printf("\nTich hai so = %.2f", tich);
        System.out.printf("\nThuong hai so = %.2f", thuong);
        System.out.printf("\nChia du hai so = %.2f", chiadu);

        // So sanh
        System.out.print("\n \nSo sanh 2 so : ");
        if (a > b) {
            System.out.println(a + ">" + b);
        } else if (a == b) {
            System.out.println(a + "=" + b);
        }
        else System.out.println(a + "<" + b);
    }

}
21
BaiThucHanhLab2 / src / Bai10.java
Comment on this file
@@ -0, 0 + 1, 21 @@
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi (khong qua 80 ky tu): ");
        String str = sc.nextLine();

        System.out.print("Nhap ky tu can dem: ");
        char ch = sc.nextLine().charAt(0);

        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                dem++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu " + ch + " trong chuoi la: " + dem);
    }
}
