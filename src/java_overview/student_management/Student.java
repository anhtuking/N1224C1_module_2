package java_overview.student_management;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    double score;

    public Student(int id, String name, double score, Scanner sc) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.sc = sc;
    }

    public Student() {
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter student id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter student score: ");
        score = Double.parseDouble(sc.nextLine());
    }

    void output() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }


}
