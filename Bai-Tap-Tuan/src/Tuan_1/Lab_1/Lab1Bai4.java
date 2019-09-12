package Tuan_1.Lab_1;

import java.util.Scanner;

public class Lab1Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b = ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c = ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.printf("Căn delta = %.2f", Math.sqrt(delta));
        scanner.close();
    }

}
