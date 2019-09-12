package Tuan_1.Lab_3;

import java.util.Scanner;

public class Lab3Bai4 {

    public static void main(String... argv) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh = ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] arrTen = new String[n];
        float[] arrDiem = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ tên sinh viên thứ " + (i + 1) + " : ");
            arrTen[i] = scanner.nextLine();
            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + " : ");
            arrDiem[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Tên: " + arrTen[i] + " - Điểm = " + arrDiem[i]);
            if (arrDiem[i] < 5) {
                System.out.println(" - Học lực: Yếu");
            } else if (arrDiem[i] < 6.5) {
                System.out.println(" - Học lực: Trung bình");
            } else if (arrDiem[i] < 7.5) {
                System.out.println(" - Học lực: Khá");
            } else if (arrDiem[i] < 9) {
                System.out.println(" - Học lực: Giỏi");
            } else {
                System.out.println(" - Học lực: Xuất sắc");
            }
        }

        for (int i = 0; i < arrDiem.length; i++) {
            for (int j = i + 1; j < arrDiem.length; j++) {
                if (arrDiem[i] > arrDiem[j]) {
                    float tempDiem = arrDiem[i];
                    arrDiem[i] = arrDiem[j];
                    arrDiem[j] = tempDiem;

                    String tempTen = arrTen[i];
                    arrTen[i] = arrTen[j];
                    arrTen[j] = tempTen;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Tên: " + arrTen[i] + " - Điểm = " + arrDiem[i]);
            if (arrDiem[i] < 5) {
                System.out.println(" - Học lực: Yếu");
            } else if (arrDiem[i] < 6.5) {
                System.out.println(" - Học lực: Trung bình");
            } else if (arrDiem[i] < 7.5) {
                System.out.println(" - Học lực: Khá");
            } else if (arrDiem[i] < 9) {
                System.out.println(" - Học lực: Giỏi");
            } else {
                System.out.println(" - Học lực: Xuất sắc");
            }
        }

        scanner.close();
    }

    public static void sapXep(){

    }

}
