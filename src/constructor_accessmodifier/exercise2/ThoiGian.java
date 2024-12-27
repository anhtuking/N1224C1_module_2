package constructor_accessmodifier.exercise2;

public class ThoiGian {
    private int gio;
    private int phut;
    private int giay;

    public ThoiGian() {
    }

    public ThoiGian(int gio) {
        this.gio = gio;
    }

    public ThoiGian(int gio, int phut) {
        this.gio = gio;
        this.phut = phut;
    }

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public ThoiGian(ThoiGian other) {
        this.gio = other.gio;
        this.phut = other.phut;
        this.giay = other.giay;
    }

    public void xuat() {
        System.out.printf("%02d : %02d : %02d", gio, phut, giay);
    }
}
