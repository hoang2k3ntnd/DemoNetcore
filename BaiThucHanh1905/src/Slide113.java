import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class slide113 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> Fruit = new HashSet<>();
		HashSet<String> fruit1 = new HashSet<>();
		fruit1.add("orange");
		fruit1.add("apple");
		fruit1.add("Pineapple");
		int a = 1;
		while (a == 1) {
			System.out.println("\n1.Thêm hoa quả");
			System.out.println("2.Hiển thị hoa quả");
			System.out.println("3.Tìm kiếm hoa quả có trong hashset không");
			System.out.println("4.xóa 1 loại hoa quả");
			System.out.println("5.Thêm hoa quả từ 1 hashset khác ");
			System.out.println("6.xoá các phần tử tồn tại trong hashset khác");
			int luachon;
			do {
				System.out.println("Nhập vào lựa chọn:");
				luachon = sc.nextInt();
			} while ((luachon < 0) || (luachon > 6));
			switch (luachon) {
			case 1:
				ThemHoaQua(Fruit);
				break;
			case 2:
				HienThi(Fruit);
				break;
			case 3:
				timKiem(Fruit);
				break;
			case 4:
				Delete(Fruit);
				break;
			case 5:
				ThemALl(Fruit, fruit1);
				break;
			case 6 :XoaAll(Fruit, fruit1);
			break;
			}
		}
	}

	public static void ThemHoaQua(Set<String> a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng hoa quả:");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhập hoa quả thứ %d ", i + 1);
			String hoaQua = sc.nextLine();
			a.add(hoaQua);
			System.out.println("Thêm thành công");
		}
	}

	public static void HienThi(Set<String> a) {
		System.out.println("Danh sách hoa quả là :");
		for (String m : a) {
			System.out.print(m + "\t");
		}
	}

	public static void timKiem(Set<String> a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên hoa quả cần kiểm tra:");
		String hoaQua = sc.nextLine();
		boolean ketQua = false;
		for (String m : a) {
			if (m.contains(hoaQua)) {
				System.out.println("Có tìm thấy");
				ketQua = true;
				break;
			}
		}
		if (!ketQua)
			System.out.println("Không tìm thấy");
	}

	public static void Delete(Set<String> a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên hoa quả cần xóa:");
		String hoaQua = sc.nextLine();
		boolean ketQua = false;
		for (String m : a) {
			if (m.contains(hoaQua)) {
				a.remove(hoaQua);
				ketQua = true;
				break;
			}
		}
		if (!ketQua)
			System.out.println("Không tìm thấy");
		System.out.print("\n Các phần tử còn lại là");
		HienThi(a);
	}

	public static void ThemALl(Set<String> a, Set<String> b) {
		a.addAll(b);
		Iterator<String> iterator = a.iterator();
		System.out.println("Các phần tử của danh sách sau khi thêm là:");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
	}
	public static void XoaAll(Set<String> a, Set<String> b) {
		a.removeAll(b);
		HienThi(a);
	}
}