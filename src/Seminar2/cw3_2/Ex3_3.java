package Seminar2.cw3_2;

import java.util.Scanner;

public class Ex3_3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите слово: ");
            String input = sc.nextLine();
            boolean isPalindrome = isPolindrome(input);
            if (isPalindrome) {
                System.out.println("Это полиндром");
            } else {
                System.out.println("Это не палиндромом.");
            }
        }

        public static boolean isPolindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
    }
