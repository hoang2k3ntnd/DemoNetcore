import java.util.Linkedlist;
import java.util.Scanner;

public class Slide111 {
    public static void main(String[] args) {
        Linkedlist<Integer> List = new Linkedlist<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong danh sach: ");
        int n = sc.nextInt();
        System.out.println("Nhap phan tu: ");
        for(int i= 0;i<n;i++)
        {
            System.out.println("Nhap phan tu thu: "+i);
            int tg = sc.nextInt();
            list.add(tg);
        }
        System.out.println("Danh sach vua nhap la: ");
        for(int x : list)
        {
            System.out.println(x +"\t");
            int sum =0;
            System.out.println("\n");
            System.out.println("Cac phan tu so nguyen duong trong danh sanch vua nhap la: ");
            for(int x : list);
            {
                if(x%2 == 0)
                {
                    System.out.print(x +"\t")
                    sum +=x;
                }
            }
            System.out.println("\n");
            System.out.print("Tong cac so nguyen duong la: ");

            System.out.printlln(sum);
        }
    }
    
    

              




        

