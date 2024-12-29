package inherit.example;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Name: ");
        name = sc.nextLine();
    }

    public void output() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
