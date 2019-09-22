package com.dhpm11.Tuan_1.Lab_4;

public class Bai_2 {

    public static void main(String[] argv) {

        Tuan_1.Lab_4.SanPham sp1 = new Tuan_1.Lab_4.SanPham();
        Tuan_1.Lab_4.SanPham sp2 = new Tuan_1.Lab_4.SanPham();

        sp1.nhap();
        sp2.nhap();

        System.out.println("--------------------");
        sp1.xuat();
        System.out.println("--------------------");
        sp2.xuat();
        System.out.println("--------------------");
    }

}
