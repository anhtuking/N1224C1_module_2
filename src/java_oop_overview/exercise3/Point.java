package java_oop_overview.exercise3;

import java.util.Scanner;

public class Point {
    Scanner sc = new Scanner(System.in);
    private double x;
    private double y;

    public void input(){
        System.out.print("Enter X: ");
        x = sc.nextDouble();
        System.out.print("Enter Y: ");
        y = sc.nextDouble();
    }

    public double khoangCach(Point p){
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }
}
