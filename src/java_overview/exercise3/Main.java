package java_overview.exercise3;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();

        System.out.println("Toa do diem thu nhat.");
        point1.input();
        System.out.println("Toa do diem thu hai.");
        point2.input();

        double distance = point1.khoangCach(point2);
        System.out.println("Khoang cach giua hai diem la: " + distance);
    }
}
