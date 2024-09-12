package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) throws IllegalArgumentException {
        if(monthNumber < 1 || monthNumber > 12)
            throw new IllegalArgumentException("monthNumber should be between 1 and 12. Got: " + monthNumber);

        if(isBetween(monthNumber, 1, 2))
            return "зима";
        else if(isBetween(monthNumber, 3, 5))
            return "весна";
        else if(isBetween(monthNumber, 6, 8))
            return "лето";
        else if(isBetween(monthNumber, 9, 11))
            return "осень";
        return "зима";
    }

    private static boolean isBetween(int value, int min, int max) {
        return value >= min && value <= max;
    }
}