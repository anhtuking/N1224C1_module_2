package oop_static;

public class Main {
    public static void main(String[] args) {
//        Math.sqrt(9);
//        Math.max(1,2);

        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();

        t1.schoolName = "Su Pham";

        System.out.println(t1.schoolName); // Su Pham
        System.out.println(t2.schoolName); // Su Pham
        // cả t1 và t2 đều thay đổi do t1 đã cập nhật gtri của schoolName

    }
}
