package inherit.exercise1;

import java.util.Scanner;

public class Infor {
    static Scanner sc = new Scanner(System.in);
    private static int oldPhoneCounter = 0; // Đếm ID cho điện thoại cũ
    private static int newPhoneCounter = 0; // Đếm ID cho điện thoại mới
    private String id; // ID của từng đối tượng
    private String name;
    private double price;
    private int warranty;
    private String manufacturer;

    public Infor() {
        // Constructor mặc định
    }

    public Infor(String name, double price, int warranty, String manufacturer) {
        this.name = name;
        this.price = price;
        this.warranty = warranty;
        this.manufacturer = manufacturer;
    }

    // Phương thức sinh ID cho điện thoại cũ
    protected static String generateOldPhoneId() {
        return String.format("DTC%03d", oldPhoneCounter++);
    }

    // Phương thức sinh ID cho điện thoại mới
    protected static String generateNewPhoneId() {
        return String.format("DTM%03d", newPhoneCounter++);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void input() {
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("Price: ");
        this.price = Double.parseDouble(sc.nextLine());
        System.out.print("Time Guarantee: ");
        this.warranty = Integer.parseInt(sc.nextLine());
        System.out.print("Manufacturer: ");
        this.manufacturer = sc.nextLine();
    }

    public void output() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price + " $");
        System.out.println("Time Guarantee: " + this.warranty);
        System.out.println("Manufacturer: " + this.manufacturer);
    }
}
