package inherit.example;

import java.util.Scanner;

public class Student extends Person {
    private double score;

    public Student() {
        super();
    }

    public Student(int id, String name, double score) {
//        getName();
//        getId();
        super(id, name);
        this.score = score;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.setName(sc.nextLine());
        super.setId(sc.nextInt());
        super.input();

        System.out.println("Enter score: ");
        this.score = sc.nextDouble();
    }
    public void output() {
        //super.output();
        System.out.println("Name: " + super.getName());
        System.out.println("ID: " + super.getId());
        System.out.println("Score: " + this.score);
    }

}
