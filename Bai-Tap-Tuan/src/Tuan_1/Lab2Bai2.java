package Tuan_1;

import java.util.Scanner;

public class Lab2Bai2 {

    public static void main(String ...args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b = ");
        double b = scanner.nextDouble();
        System.out.print("nhập c = ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                System.out.print("Phương trình vô nghiệm");
            } else {
                System.out.printf("Phương trình có 1 nghiệm x = %.2f", (-c/b));
            }
        } else {
            if (delta > 0) {
                System.out.println("Phương trình có 2 nghiệm kép");
                System.out.printf("x1 = %.2f \n", (-b + Math.sqrt(delta)) / (2*a));
                System.out.printf("x2 = %.2f", (-b - Math.sqrt(delta)) / (2*a));
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép");
                System.out.printf("x = %.2f", (-b / (2*a)));
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }

        scanner.close();
    }

}
