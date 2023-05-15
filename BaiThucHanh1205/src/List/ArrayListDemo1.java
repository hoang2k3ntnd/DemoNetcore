package Lists;
import java.util.ArrayList;
import java.util.Scanner;
import Demo.Employee;
public class ArrayListDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> eplList =new ArrayList<>();
		int a=1;
		while(a==1) {
		System.out.println("\n1.Thêm Thông Tin.");
		System.out.println("2.Hiển Thị Thông Tin.");
		System.out.println("3.Sửa Thông Tin.");
		System.out.println("4.Xóa Thông Tin");
		int luachon;
		do {
			System.out.println("Nhập vào lựa chọn:");
			luachon=sc.nextInt();	
		}while((luachon<=0)||(luachon>4));
		switch(luachon) {
		case 1 : Employee.ThemThongTin(eplList);
		break;
		case 2 : Employee.HienTHi(eplList);
		break;
		case 3 : Employee.Update(eplList);
		break;
		case 4: Employee.deLete(eplList);
		break;
}
		}
	}
}