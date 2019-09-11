package Tuan_1;

import java.util.Scanner;

public class Lab2Bai1 {

    public static void main(String ...args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b = ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.print("Vô số nghiệm");
            } else {
                System.out.print("Vô nghiệm");
            }
        } else {
            double x = -b/a;
            System.out.printf("Có 1 nghiệm x = %.2f", x);
        }
        scanner.close();
    }

}
