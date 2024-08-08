package Seminar6.cw1_1;

import java.util.*;

public class Ex1_1 {
    public static void main(String[] args) {
        List<Integer> array = fillArray(1000, 25);
        System.out.println("Arrays.toString(array) = " + array);
        System.out.println(getUniquePercent((ArrayList<Integer>) array) + "%");
    }

    public static ArrayList<Integer> fillArray(int size, int bound) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(rnd.nextInt(bound));
        }
        return arr;
    }

    public static float getUniquePercent(ArrayList<Integer> arr) {
        Set<Integer> uniqueValue = new HashSet<>(arr);
        return uniqueValue.size() * 100f / arr.size();
    }
}
