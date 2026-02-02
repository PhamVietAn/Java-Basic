package com.rikkeiedu.management;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tính điểm trung bình");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    averageScore();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    static void addStudent() {
        System.out.print("Nhập họ tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập điểm: ");
        double score = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập lớp: ");
        String className = sc.nextLine();

        students.add(new Student(name, score, className));
        System.out.println("Thêm học sinh thành công!");
    }

    static void showStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Student s : students) {
            s.display();
        }
    }

    static void averageScore() {
        if (students.isEmpty()) {
            System.out.println("Chưa có học sinh!");
            return;
        }
        double sum = 0;
        for (Student s : students) {
            sum += s.getScore();
        }
        System.out.println("Điểm trung bình: " + (sum / students.size()));
    }
}
