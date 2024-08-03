package Seminar1.cw1;

import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = getGetSumMinusPr(n);
        System.out.println("result= " + result);

    }

    /**
     * @apiNote до описание
     * @param n начальное значение
     * @return произведение минус сумма
     */
    private static int getGetSumMinusPr(int n) {
        int sum = 0;
        int pr = 1;

        while (n != 0) {
            sum += n % 10;
            pr *= n % 10;
            n /= 10;
        }
        return pr - sum;
    }
}