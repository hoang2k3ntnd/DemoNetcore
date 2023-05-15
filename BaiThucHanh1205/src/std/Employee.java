package Demo;

import java.util.List;
import java.util.Scanner;
public class Employee {
	public String MaNhanVien;
	public String TenNhanVien;
	public int Tuoi;
	public String QueQuan;
	public String SoDienThoai;
	public void NhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào mã nhân viên:");
		MaNhanVien = sc.nextLine();
		System.out.println("Nhập vào tên nhân viên:");
		TenNhanVien = sc.nextLine();
		System.out.println("Nhập vào tuổi nhân viên:");
		Tuoi= sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập vào số điện thoại:");
		SoDienThoai=sc.nextLine();
		System.out.println("Nhập vào quê quán");
		QueQuan= sc.nextLine();
	}
	public void setMaNhanVien(String MaNhanVien) {
		this.MaNhanVien=MaNhanVien;
	}
	public String getMaNhanVien() {
		return MaNhanVien;
	}
	public static void ThemThongTin(List<Employee> Lepl) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng nhân viên");
		int n = sc.nextInt();
		for(int i =0 ; i<n ;i++) {
			Employee epl = new Employee();
			epl.NhapThongTin();
			Lepl.add(epl);
			System.out.println("Thành công");
		}
	}
	public static void HienTHi(List<Employee> eplList) {
		for(int i =0; i < eplList.size();i++) {
			System.out.printf("Nhân viên:%s có mã là: %s, %dtuổi,địa chỉ:%s,số điện thoại:%s\n",eplList.get(i).TenNhanVien,eplList.get(i).MaNhanVien,eplList.get(i).Tuoi,eplList.get(i).QueQuan,eplList.get(i).SoDienThoai);
		}
	}
	public static void Update (List<Employee> eplList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã nhân viên cần thay đổi:");
		 String abc=sc.nextLine();
		 boolean a=false;
		 for(int i=0;i<eplList.size();i++) {
			 if(eplList.get(i).MaNhanVien.equals(abc)) {
				 Employee newepl = new Employee();
				 newepl.NhapThongTin();
				 eplList.set(i,newepl);
				 System.out.println("Thành công");
				 a=true;
				 break;
			 }
			 if(!a) 
				 System.out.println("Không tìm thấy nhân viên");
		 }
	}
	public static void deLete (List<Employee> eplList) {
		System.out.println("Nhập mã nhân viên cần xóa");
		Scanner sc = new Scanner(System.in);
		String abc = sc.nextLine();
		boolean a= false;
		for(int i=0;i<eplList.size();i++) {
			if(eplList.get(i).MaNhanVien.equals(abc)) {
				eplList.remove(i);
				System.out.println("Thành công");
				a=true;
				break;
			}
			if(!a)
				System.out.println("Không tìm thấy nhân viên");
		}
		
	}
}