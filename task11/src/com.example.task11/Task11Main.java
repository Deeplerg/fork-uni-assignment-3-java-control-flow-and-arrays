package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        if(arr == null || arr.length == 0)
            return;

         int minIndex = numMin(arr);

         int temp = arr[minIndex];
         arr[minIndex] = arr[0];
         arr[0] = temp;
    }

    // I could also just do this:
    // int minIndex = Task10Main.numMin(arr)
    private static int numMin(int[] arr) {
        int minIndex = 0;
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];

            if(element <= minValue) {
                minValue = element;
                minIndex = i;
            }
        }

        return minIndex;
    }
}