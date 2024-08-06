package Seminar2.cw2_2;

import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите строку для сжатия: ");
            String input = sc.nextLine();

// Проверка на пустую строку
            if (input.length() == 0) {
                System.out.println("");
                return;
            }
            StringBuilder res = new StringBuilder();
            res.append(input.charAt(0));

            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) != input.charAt(i - 1)) {
                    res.append(input.charAt(i));
                }
            }

            System.out.println("Сжатая строка: " + res.toString());



                    }
    }
