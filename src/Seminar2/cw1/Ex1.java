package Seminar2.cw1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        shuffleline(n);
    }

    private static void shuffleline(int n) {
        String line1 = "c1";
        String line2 = "c2";
        String result = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result += line1;
            } else {
                result += line2;
            }
        }
        System.out.println(result);
    }
}
