package constructor_accessmodifier.exercise2;

public class Main {
    public static void main(String[] args) {
        ThoiGian a = new ThoiGian();
        a.xuat();

        ThoiGian b = new ThoiGian(7);
        b.xuat();

        ThoiGian c = new ThoiGian(7,30);
        c.xuat();

        ThoiGian d = new ThoiGian(7,30,50);
        d.xuat();

        ThoiGian e = new ThoiGian(d);
        e.xuat();
    }
}
