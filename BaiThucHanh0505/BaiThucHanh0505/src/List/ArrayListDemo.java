package Lists;

import java.util.ArrayList;
import java.util.Scanner;

import std.Student;

public class ArrayListDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
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