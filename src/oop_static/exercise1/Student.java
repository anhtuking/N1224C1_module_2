package oop_static.exercise1;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private double score;
    static int counter = 0;

    public Student() {
        counter++;
    }
}
