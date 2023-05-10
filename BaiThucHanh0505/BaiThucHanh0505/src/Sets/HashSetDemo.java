package baithuchanhlab4.src.Sets;

import java.util.HashSet;
import java.util.Scanner;


import std.Student;

public class HashSetDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Student> studentList = new HashSet<Student>();
        System.out.print("Nhap phan tu muon them : ");
        int n = sc.nextInt();
        int choose;
        do {
            System.out.print("\nNhap lua chon : ");
            choose = sc.nextInt();
            switch(choose) {
                case 1:
                Student.Add(studentList,n);
                break;
                case 2:
                Student.Display(studentList);
                break;
                case 3:
                Student.Update(studentList);
                break;
                case 4:
                Student.Delete(studentList);
                break;
                default:
                System.out.print("Vui long nhap lai !");
                break;
            }

        }while(choose < 5);
      
    }
}
