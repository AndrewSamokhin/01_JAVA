package Seminar2.cw3;
/**
Задание 3. Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает
boolean значение).
*/

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = sc.nextLine();
        boolean flag = true;
        for (int i = 0; i < input.length()/2; i++) {
            if (input.charAt(i) != input.charAt(input.length()-i-1)){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Строка является палендромом");
        }
        else{
            System.out.println("Строка не является палендромом");
        }
    }
}
