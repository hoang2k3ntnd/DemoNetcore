package ngay2804;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class slide93 {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		LinkedHashMap<String,String>  LKHM = new LinkedHashMap<>();
		System.out.println("Nhap so luong can them vao map:");
		int n= sc.nextInt();sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("nhập tên:");
			String key= sc.nextLine();
			System.out.println("Nhập địa chỉ:");
			String value = sc.nextLine();
			LKHM.put(key, value);
		}
		show(LKHM);
		System.out.println("\nNhập vào tên muốn xóa:");
		String ten = sc.nextLine();
		LKHM.remove(ten);
		System.out.println("sau khi xóa");
		show(LKHM);
		}
	public static void show(LinkedHashMap<String,String> lkm) {
		for(Map.Entry<String,String> m:lkm.entrySet()) {
			
			System.out.printf("%s -%s\n",m.getKey(),m.getValue());
			}
	}
	}