package java_overview.student_management;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        // student : bien doi tuong
        // new Student();  : doi tuong


//        student.input();
//        student.output();

        int n = 5; // use do while

        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 1; i < n; i++) {
            System.out.println("-----Nhap thong tin sv thu -----" + i);
            student.input();
            students.add(student);
        }

        for (int i = 0; i < students.size(); i++) {
            System.out.println("-----Thong tin sinh vien thu -----" + i);
            students.get(i - 1).input();
        }

    }
}
