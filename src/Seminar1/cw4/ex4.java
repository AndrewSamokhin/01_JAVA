package Seminar1.cw4;

import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        //Массивы:
        //Дан массив целых чисел.
        // Верно ли, что массив является симметричным.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите значения массива");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        if(isSmmetr(arr)) {
            System.out.println("Симметричный");
        }else {
            System.out.println("Несимметричный");
        }

        System.out.println("Массив выглядит так:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" %d , " ,arr[i]);
        }
    }

    private static boolean isSmmetr(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            if( arr[i] != arr[arr.length-1 -i]){
                return false;
            }
        }
        return true;
    }
}
