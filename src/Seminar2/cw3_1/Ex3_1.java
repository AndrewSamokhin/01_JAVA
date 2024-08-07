package Seminar2.cw3_1;
/**
Задание 3. Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает
boolean значение).
*/

public class Ex3_1 {
    public static void main(String[] args) {
        String stroka = "qwe eWQ".replaceAll("\\s", "").toLowerCase();
        if (stroka.equals(
                new StringBuilder(stroka).reverse().toString())) {
            System.out.println("палиндром");
        } else {
            System.out.println("не палиндром");
        }
    }
}
