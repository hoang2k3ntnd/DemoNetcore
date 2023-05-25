import java.util.ArrayList;
import java.util.Scanner;
import baitapcuoichuong.SinhVien;
public class side112 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			ArrayList<SinhVien> sinhVien=new ArrayList<>();
			int a=1;
			while(a==1) {
				System.out.println("\n1.Thêm sinh viên");
				System.out.println("2.Hiển thị sinh viên");
				System.out.println("3.Đếm số sinh viên thi lại và hiển thị");
				System.out.println("4.Hiển thị các sinh viên có điểm cao nhất");
				System.out.println("5.Tìm kiếm");
				int luachon;
				do {
					System.out.println("Nhập vào lựa chọn:");
					luachon=sc.nextInt();
				}while((luachon<0)||(luachon>5));
				switch(luachon) {
				case 1:
					SinhVien.ThemSinhVien(sinhVien);
					break;
				case 2 :
					SinhVien.HienThi(sinhVien);
					break;
				case 3 :
					SinhVien.DemSinhVien(sinhVien);
					break;
				case 4: 
					SinhVien.maxcore(sinhVien);
					break;
				case 5:
					SinhVien.TimKiem(sinhVien);
					break;
		
		}
}
}
}