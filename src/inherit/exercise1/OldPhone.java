package inherit.exercise1;

import java.util.Scanner;

public class OldPhone extends Phone {
    static Scanner sc = new Scanner(System.in);
    private int batteryCapacity;
    private String description;

    public OldPhone() {
        super();
        this.setId(generateOldPhoneId());
    }

    public OldPhone(String name, double price, int warranty, String manufacturer, int batteryCapacity, String description) {
        super(name, price, warranty, manufacturer);
        this.setId(generateOldPhoneId());
        this.batteryCapacity = batteryCapacity;
        this.description = description;
    }

    public void input(){
        super.input();
        System.out.print("Enter Battery Capacity: ");
        batteryCapacity = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Description: ");
        description = sc.nextLine();
    }

    public void output(){
        super.output();
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Description: " + description);
    }
}
