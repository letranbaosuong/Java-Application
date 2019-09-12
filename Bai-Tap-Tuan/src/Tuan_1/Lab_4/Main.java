package Tuan_1.Lab_4;

public class Main {

    public static void main(String... argv) {
        SanPham sp1 = new SanPham("sản phẩm 1",100000);
        SanPham sp2=new SanPham("sản phẩm 2",3000000,3000);

        sp1.xuat();
        sp2.xuat();
    }

}
