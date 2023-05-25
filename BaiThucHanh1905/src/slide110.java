import java.rmi.Remote;
import java util.ArrayList;
import java.util.Scanner;

public class Slide110 {
    public static void main(String[] agrs) {
        ArrayList,Integer> arrList = new ArrayList<>();
        Scanner(System.in);
        int n;
        System.out.print("Nhap so phan tu trong mang: ");
        n = sc.nextInt();

        System.out.println("Nhap mang: ");
        for(int i =0; i<n; i++)
        {
            System.out.print("Nhap phan tu thu"+i+": ");
            int tg = sc.nextInt();
            arrList.add(tg);
        }

        int max = arrList.get(0);
        for(int i= 1; i<arrList.size(); i++){

            if(arrList.get(i).compareTo(max)>0){
                max = arrList.get(i);
            }
        }

        System.out.print("Mang vua nhap la: ");
        for(int x : arrList)
        {
            System.out.print(x +"\n");
        }
        System.out.println("\n");
        System.out.println("Phan tu lon nhat trong mang la: "+ max);
        System.out.print("Nhap phan tu muon xoa:");
        int c = sc.nextInt();
        arrList.remove(c):

        System.out.print("Nhap mang sau khi xoa phan tu"+c+"la: ");
        for(int x : arrList)
        {
            System.out.print(x +"\n")
        }
    }
}



