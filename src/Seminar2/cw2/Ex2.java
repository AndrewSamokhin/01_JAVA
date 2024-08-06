package Seminar2.cw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String c1 = "c1";
        String c2 = "c2";

        getStrOfChars(n, c1, c2);
        String s = getStrOfChars(n, c1, c2);
        System.out.println("s = " + s);
        System.out.println("s.length = " + s.length());
    }
    private static String getStrOfChars(int n, String c1, String c2) throws Exception {
        if (n <= 0 || n % 2 == 1) {
            throw new Exception("Не валидное значение N");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }
}



