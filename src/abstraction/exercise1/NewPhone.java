package abstraction.exercise1;

import java.util.Scanner;

public class NewPhone extends Phone {
    static Scanner sc = new Scanner(System.in);
    private int quantity;

    public NewPhone() {
        super();
        this.setId(generateNewPhoneId());
    }

    public NewPhone(String name, double price, int warranty, String manufacturer, int quantity) {
        super(name, price, warranty, manufacturer);
        this.setId(generateNewPhoneId());
        this.quantity = quantity;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * quantity;
    }

    public void input(){
        super.input();
        System.out.print("Quantity: ");
        quantity = Integer.parseInt(sc.nextLine());
    }

    public void output(){
        super.output();
        System.out.println("Quantity: " + quantity);
    }
}
