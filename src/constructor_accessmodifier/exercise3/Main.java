package constructor_accessmodifier.exercise3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Anh Tu", 10);

        System.out.println("----- Thong tin -----");
        System.out.println("Id: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Score: " + student.getScore());

        // chinh sua thong tin hop le
        System.out.println("----- Thong tin sau chinh sua -----");
        System.out.println("Id : " + student.getId());
        student.setName("Duong Van Anh Tu");
        System.out.println("Name: " + student.getName());
        student.setScore(9.5);
        System.out.println("Score: " + student.getScore());

        // chinh sua thong tin khong hop le
        System.out.println("----- Thong tin sau chinh sua -----");
        System.out.println("Id : " + student.getId());
        student.setName("");
        student.setScore(11);
    }
}
