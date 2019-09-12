package Tuan_1.Lab_4;

import java.util.Scanner;

public class SanPham {

    private String tenSp;
    private double donGia;
    private double giamGia;

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    private double getThueNhapKhau() {
        return (this.donGia * 10 / 100);
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + this.tenSp);
        System.out.println("Đơn giá: " + this.donGia);
        System.out.println("Giảm giá: " + this.giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        this.tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá sản phẩm: ");
        this.donGia = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập giá giảm sản phẩm: ");
        this.giamGia = Double.parseDouble(scanner.nextLine());

    }
}
