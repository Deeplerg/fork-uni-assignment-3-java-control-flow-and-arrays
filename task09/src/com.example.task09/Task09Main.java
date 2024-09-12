package com.example.task09;

import java.util.Arrays;
import java.util.OptionalInt;

public class Task09Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = -1;
        arr[2] = 3;
        System.out.println(min(arr));
         */
    }

    static int min(int[] arr) throws IllegalArgumentException {
        OptionalInt optionalMinimalValue = Arrays.stream(arr).min();

        // simply returning optionalMinimalValue.getAsInt() is an option as well,
        // however NoSuchElementException is less descriptive.

        if(!optionalMinimalValue.isPresent())
            throw new IllegalArgumentException("The array cannot be empty.");

        return optionalMinimalValue.getAsInt();
    }

}