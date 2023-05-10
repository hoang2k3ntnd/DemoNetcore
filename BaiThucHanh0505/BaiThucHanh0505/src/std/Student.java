package baithuchanhlab4.src.std;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Student {
    public String fullName;
    public int Age;

    public void inputData(List<Student> StudentList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten : ");
        fullName = sc.nextLine();
        System.out.print("Nhap tuoi : ");
        Age = sc.nextInt();
    }

    public static void Add(List<Student> StudentList, int n) {
        for (int i = 0; i < n; i++) {
            Student std = new Student();
            System.out.println(i);
            std.inputData(StudentList);
            StudentList.add(std);
        }

    }

    public static void Display(List<Student> StudentList) {
        for (int i = 0; i < StudentList.size(); i++) {
            String name = StudentList.get(i).fullName;
            int age = StudentList.get(i).Age;
            System.out.printf("\n" + i + ". Ten : %s - Tuoi : %d", name, age);

        }
    }

    public static void Update(List<Student> StudentList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten hoc sinh can thay the : ");
        String name = sc.nextLine();
        for (int i = 0; i < StudentList.size(); i++) {
            if (StudentList.get(i).fullName.equals(name)) {
                Student std = new Student();
                std.inputData(StudentList);
                StudentList.set(i, std);
                System.out.println("Thanh cong !");
            }
        }
    }

    public static void Delete(List<Student> StudentList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten hoc sinh can xoa : ");
        String name = sc.nextLine();
        for (int i = 0; i < StudentList.size(); i++) {
            if (StudentList.get(i).fullName.equals(name)) {
                StudentList.remove(i);
            }
        }
    }

    /////////////////////////// Set//////////////////////////
    public void inputData(Set<Student> StudentList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten : ");
        fullName = sc.nextLine();
        System.out.print("Nhap tuoi : ");
        Age = sc.nextInt();
    }

    public static void Add(Set<Student> StudentList, int n) {
        for (int i = 0; i < n; i++) {
            Student std = new Student();
            System.out.println(i);
            std.inputData(StudentList);
            StudentList.add(std);
        }

    }

    public static void Display(Set<Student> StudentList) {
        for (Student std : StudentList) {
            String name = std.fullName;
            int age = std.Age;
            System.out.printf("\n" + "Ten : %s - Tuoi : %d", name, age);

        }
    }

    public static void Update(Set<Student> StudentList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten hoc sinh can thay the : ");
        String name = sc.nextLine();
        for (Student s : StudentList) {
            if (s.fullName.equals(name)) {
                Student std = new Student();
                StudentList.remove(s);
                System.out.println("Nhap thong tin hoc sinh thay moi : ");
                std.inputData(StudentList);
                StudentList.add(std);
                System.out.println("Thanh cong !");
            }
        }
    }

    public static void Delete(Set<Student> StudentList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten hoc sinh can xoa : ");
        String name = sc.nextLine();
        for (Student s : StudentList) {
            if (s.fullName.equals(name)) {
                StudentList.remove(s);
            }
        }
    }
}