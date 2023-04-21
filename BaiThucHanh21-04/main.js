package HinhHoc;

import java.util.Scanner;

public class PhanMain {
	public static void main(String[] args) {
		while (true) {
		Scanner sc = new Scanner(System.in);
		int luachon;
			System.out.println("\n1.Hinh Chu Nhat");
			System.out.println("2.Hinh tron");
			System.out.println("3.Hinh Vuong");
			System.out.println("4.Hinh Tru");
			do {
				System.out.print("\nNhap vao lua chon: ");
				luachon = sc.nextInt();
				if ((luachon < 0) || (luachon > 4)) {
					System.out.println("VUI LONG NHAP LAI");
				}
			} while ((luachon < 0) || (luachon > 4));
			switch (luachon) {
				case (1):
			HinhChuNhat hcn = new HinhChuNhat("Hinh Chu Nhat", 5, 6);
					System.out.println(hcn.getTen());
					System.out.println("Chu vi la:" + hcn.ChuVi());
					System.out.println("Dien tich la:" + hcn.DienTich());
					break;
				case (2):
			HinhTron HT = new HinhTron("Hinh Tron", 5);
					System.out.println(HT.getTen());
					System.out.println("Chu vi la:" + HT.ChuVi());
					System.out.println("Dien tich la:" + HT.DienTich());
					break;
				case (3):
			HinhVuong hv = new HinhVuong("Hinh Vuong", 5);
					System.out.println(hv.getTen());
					System.out.println("Chu vi la:" + hv.ChuVi());
					System.out.println("DienTich" + hv.DienTich());
					break;
				case (4):
			HinhTru Ht = new HinhTru("Hinh Tru", 5, 7);
					System.out.println(Ht.getTen());
					System.out.println("Dien tich la:" + Ht.DienTich());
					System.out.println("The tich la:" + Ht.TheTich());
					break;
			}
		}
	}
}
