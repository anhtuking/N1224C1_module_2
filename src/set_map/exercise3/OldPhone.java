package set_map.exercise3;

import java.util.Scanner;

public class OldPhone extends Phone implements Discountable {
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

    @Override
    public double calculateTotalPrice() {
        return getPrice();
    }

    @Override
    public void discount(double percentage) {
        double discountedPrice = getPrice() * (1 - percentage / 100.0);
        setPrice(discountedPrice);
    }

    public void input(){
        super.input();
        System.out.print("Battery Capacity: ");
        batteryCapacity = Integer.parseInt(sc.nextLine());

        System.out.print("Description: ");
        description = sc.nextLine();
    }

    public void output(){
        super.output();
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Description: " + description);
    }
}
