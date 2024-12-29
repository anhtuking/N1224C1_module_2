package oop_static.exercise2;

public class Main {
    public static void main(String[] args) {
        double so1 = 10.0;
        double so2 = 5.0;

        double tong = MathUtil.cong(so1, so2);
        System.out.println("Cong: " + tong);
        double hieu = MathUtil.tru(so1, so2);
        System.out.println("Tru: " + hieu);
        double tich = MathUtil.nhan(so1, so2);
        System.out.println("Nhan: " + tich);
        double thuong = MathUtil.chia(so1, so2);
        System.out.println("Chia: " + thuong);
    }
}
