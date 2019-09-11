package Tuan_1;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập sô phần tử của mảng: ");
        int n = scanner.nextInt();
        if (n > 0) {
            int[] arrNum = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("a [ " + (i + 1) + " ] = ");
                arrNum[i] = scanner.nextInt();
            }
            System.out.println("Các phần tử của mảng là:");
            for (int i = 0; i < n; i++) System.out.print(arrNum[i] + " ");

            System.out.println();
            Arrays.sort(arrNum);
            System.out.println("Array Sort:");
            for (int i = 0; i < n; i++) System.out.print(arrNum[i] + " ");

            System.out.println();
            int min = arrNum[0], Min = 0;
            for (int i = 1; i < n; i++) {
                Min = Math.min(min, arrNum[i]);
            }
            System.out.println("Min = " + Min);

            int tong = 0, dem = 0;
            for (int i = 0; i < n; i++) {
                if (arrNum[i] % 3 == 0) {
                    tong += arrNum[i];
                    dem++;
                }
            }
            float tbCong = tong / dem;
            System.out.println("Trung bình cộng các số chia hết cho 3 = " + tbCong);
        } else {
            System.out.print("Số phần tử phải lớn hơn 0");
        }
        scanner.close();
    }

}
