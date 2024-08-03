package Seminar1.cw3;

public class Ex3 {
    public static void main(String[] args) {
        //Cтроки: Дана строка. Поменять местами ее половины.
        String str = "startstopp";
        String result = str.substring(str.length()/2) +
        str.substring(0, str.length()/2);
        System.out.println("result - " + result);

    }
}
