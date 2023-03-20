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