package ngay2804;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class slide105 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String,String> Tmap = new TreeMap<>();
		System.out.println("Nhap so luong can them vao map:");
		int n= sc.nextInt();sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("nhập tên:");
			String key= sc.nextLine();
			System.out.println("Nhập địa chỉ:");
			String value = sc.nextLine();
			Tmap.put(key, value);
		}
		show(Tmap);
		
	}
	public static void show(TreeMap<String,String> lkm) {
		for(Map.Entry<String,String> m:lkm.entrySet()) {
			
			System.out.printf("%s -%s\n",m.getKey(),m.getValue());
			}
}
}