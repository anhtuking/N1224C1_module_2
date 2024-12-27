package java_oop_overview.exercise2;

public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();

        System.out.println("Nhap phan so thu nhat.");
        ps1.input();
        System.out.println("Nhap phan so thu hai.");
        ps2.input();
        System.out.println("----------------------");
        System.out.print("Phan so thu nhat: ");
        ps1.output();
        System.out.print("Phan so thu hai: ");
        ps2.output();

        System.out.println("----------------------");
        System.out.print("Tong 2 phan so: ");
        ps1.cong(ps2).output();
        System.out.print("Hieu 2 phan so: ");
        ps1.tru(ps2).output();
        System.out.print("Tich 2 phan so: ");
        ps1.nhan(ps2).output();
        System.out.print("Thuong 2 phan so: ");
        ps1.chia(ps2).output();

        System.out.println("----------------------");
        System.out.println("Phan so thu nhat la phan so " + (ps1.phanSoDuong() ? "duong" : "am"));
        System.out.println("Phan so thu hai la phan so " + (ps2.phanSoDuong() ? "duong" : "am"));
        System.out.println("Phan so thu nhat la phan so " + (ps1.phanSoBangKhong() ? "= 0" : "!= 0"));
        System.out.println("Phan so thu hai la phan so " + (ps2.phanSoBangKhong() ? "= 0" : "!= 0"));
    }
}
