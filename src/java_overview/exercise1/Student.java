package java_overview.exercise1;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private String hoTen;
    private double diemToan;
    private double diemVan;

    public void input() {
        System.out.print("Nhap ten hoc sinh: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem toan: ");
        diemToan = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem van: ");
        diemVan = Double.parseDouble(sc.nextLine());
    }

    public double diemTrungBinh() {
        return (diemToan + diemVan) / 2;
    }

    public void output() {
        System.out.println("----------------------------");
        System.out.println("Ho va ten hoc sinh: " + hoTen);
        System.out.println("Diem toan: " + diemToan);
        System.out.println("Diem van: " + diemVan);
        System.out.println("Diem trung binh: " + diemTrungBinh());

    }
}
