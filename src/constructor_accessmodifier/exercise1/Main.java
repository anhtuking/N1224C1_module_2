package constructor_accessmodifier.exercise1;

public class Main {
    public static void main(String[] args) {
        PhanSo a = new PhanSo();
        a.xuat();

        PhanSo b = new PhanSo(1,2);
        b.xuat();

        PhanSo c = new PhanSo(3);
        c.xuat();

        PhanSo d = new PhanSo(-6,-2);
        d.xuat();

        PhanSo e = new PhanSo(3,-1);
        e.xuat();

        PhanSo f = e.copy();
        f.cong(100);
        e.xuat();
        f.xuat();
    }
}
