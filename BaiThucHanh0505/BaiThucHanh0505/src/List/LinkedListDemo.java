package baithuchanhlab4.src.Lists;

import java.util.LinkedList;
import java.util.Scanner;

import std.Student;

public class LinkedListDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> studentList = new LinkedList<>();
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