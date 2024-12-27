package java_oop_overview.exercise2;

import java.util.Scanner;

public class PhanSo {
    private int soTu;
    private int soMau;
    Scanner sc = new Scanner(System.in);

    public PhanSo(int soTu, int soMau) {
        this.soTu = soTu;
        this.soMau = soMau;
    }

    public PhanSo() {

    }

    public void input() {
        System.out.print("Nhap vao phan tu: ");
        soTu = Integer.parseInt(sc.nextLine());
        do {
            System.out.print("Nhap vao phan mau ( >0 ): ");
            soMau = sc.nextInt();
        } while (soMau <= 0);
    }

    public void output() {
        rutGon();
        if (soMau == 1) {
            System.out.println(soTu);
        } else {
            System.out.print(soTu + "/" + soMau);
        }
    }

    public void rutGon() {
        int ucln = uocChungLonNhat(soTu, soMau);
        soTu /= ucln;
        soMau /= ucln;

        // xu ly mau
        if (soMau < 0) {
            soTu = -soTu;
            soMau = -soMau;
        }

    }

    public int uocChungLonNhat(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }
        a = Math.abs(a);
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public PhanSo cong(PhanSo ps) {
        PhanSo tong = new PhanSo();
        tong.soTu = this.soTu * ps.soMau + ps.soTu * this.soMau;
        tong.soMau = this.soMau * ps.soMau;
        return tong;
    }

    public PhanSo tru(PhanSo ps) {
        PhanSo tru = new PhanSo();
        tru.soTu = this.soTu * ps.soMau - this.soMau * ps.soTu;
        tru.soMau = this.soMau * ps.soMau;
        return tru;
    }

    public PhanSo nhan(PhanSo ps) {
        PhanSo nhan = new PhanSo();
        nhan.soTu = this.soTu * ps.soTu;
        nhan.soMau = this.soMau * ps.soMau;
        return nhan;
    }

    public PhanSo chia(PhanSo ps) {
        PhanSo chia = new PhanSo();
        chia.soTu = this.soTu * ps.soMau;
        chia.soMau = this.soMau * ps.soTu;
        return chia;
    }

    public boolean phanSoDuong() {
        return soTu * soMau > 0 || soTu == 0;
    }

    public boolean phanSoBangKhong() {
        return soTu == 0;
    }

}
