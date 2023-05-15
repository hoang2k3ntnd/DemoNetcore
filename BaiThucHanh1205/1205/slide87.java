package ngay2804;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class slide87 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> newHs= new HashMap<>();
		newHs.put("ND","Nam Dinh");
		newHs.put("TB","Thai Binh");
		newHs.put("NB","Ninh Binh");
		newHs.put("HN","Ha Nam");
		newHs.put("PT","Phu Tho");
		Set<Map.Entry<String,String>> setnewHs = newHs.entrySet();
		System.out.println(" cac entry co trong map la:");
		System.out.println(setnewHs);
		System.out.println("Nhap key can tim:");
		String key = sc.nextLine();
		System.out.println(key +":"+newHs.get(key));
	}
}