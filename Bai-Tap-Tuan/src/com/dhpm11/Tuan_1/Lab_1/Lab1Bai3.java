package com.dhpm11.Tuan_1.Lab_1;

import java.util.Scanner;

public class Lab1Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính thể tích khối lập phương!");
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();
        double theTich = Math.pow(canh, 3);

        System.out.printf("Thể tích của khối chữ nhật = %.2f", theTich);
        scanner.close();
    }

}
