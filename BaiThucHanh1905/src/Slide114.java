import java.util.HashMap;
import java.util.Scanner;
public class slide115 {
		public static void main(String[] args) {
			HashMap<String, SinhVien> newSinhVien = new HashMap<>();
			Scanner sc = new Scanner(System.in);
			int a = 1;
			while (a == 1) {
				System.out.println("\n1.Thêm sinh viên");
				System.out.println("2.Hiển Thị");
				System.out.println("3.Tìm sinh viên thông qua lớp");
				System.out.println("4.Tìm kiếm sinh viên qua mã sinh viên");
				int luachon;
				do {
					System.out.println("Nhập lựa chọn:");
					luachon = sc.nextInt();
				} while ((luachon < 0) || (luachon > 4));
				switch (luachon) {
				case 1:
				SinhVien.Add(newSinhVien);
					break;
				case 2:
					SinhVien.hienThi(newSinhVien);;
					break;
				case 3:
					SinhVien.findLop(newSinhVien);
					break;
				case 4:
					SinhVien.findMa(newSinhVien);
					break;
				}
			}
		}
	}