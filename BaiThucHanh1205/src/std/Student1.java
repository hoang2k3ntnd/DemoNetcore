package Demo;

import java.util.Scanner;
import java.util.Set;

public class Student1 extends Student {
	public void NhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên:");
		FullName= sc.nextLine();
		System.out.println("Nhập vào tuổi sinh viên:");
		Age = sc.nextInt();
	}
	public static void HienThi(Set<Student1>stdList) {
		for (Student1 str : stdList) {
	        System.out.printf("Sinh viên:%s, %d tuổi\n",str.FullName,str.Age);
	    }
	}
	public static void ThemMoi(Set<Student1> stdList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số sinh viên cần thêm:");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			Student1 std = new Student1();
			std.NhapThongTin();
				stdList.add(std);
				System.out.println("Thành công");
		}
	}
	public static void Update(Set<Student1> stdList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên cần sửa:");
		String ten = sc.nextLine();
		boolean a= false;
		for(Student1 str : stdList)
			if (str.getFullName().equals(ten)) {
				Student1 std = new Student1();
				std.NhapThongTin();
				stdList.remove(str);
				stdList.add(std);
				System.out.println(" Thay Đổi Thành công");
				a=true;
	        }
	    if(!a) {
	    	System.out.println("Không tìm thấy trong danh sách");
	    }
	}
	public static void Delete(Set<Student1> stdList) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Nhập tên sinh viên cần xóa");
	    String ten = sc.nextLine();
	    boolean a= false;
	    for(Student1 str : stdList)
			if (str.getFullName().equals(ten)) {
	            stdList.remove(str);
	            System.out.println("Xóa thành công");
	            a=true;
	        }
	    if(!a) {
	    	System.out.println("Không tìm thấy trong danh sách");
	    }

	}
}