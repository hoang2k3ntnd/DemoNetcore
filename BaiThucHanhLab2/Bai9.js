import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        int soKyTuThuong = 0;
        int soKyTuHoa = 0;
        int soChuSo = 0;

        char[] kyTu = str.toCharArray();
        for (int i = 0; i < kyTu.length; i++) {
            char kiTu = kyTu[i];
            if (Character.isLowerCase(kiTu)) {
                soKyTuThuong++;
            } else if (Character.isUpperCase(kiTu)) {
                soKyTuHoa++;
            } else if (Character.isDigit(kiTu)) {
                soChuSo++;
            }
        }
        System.out.println("So ky tu thuong: " + soKyTuThuong);
        System.out.println("So ky tu hoa: " + soKyTuHoa);
        System.out.println("So chu so: " + soChuSo);
    }
}    