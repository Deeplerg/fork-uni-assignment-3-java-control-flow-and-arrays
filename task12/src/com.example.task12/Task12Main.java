package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if(arr == null || arr.length == 0)
            return;

        for (int i = 0; i < arr.length; i++) {
            int minIndex = findIndexOfMinStartingFromIndex(arr, i);
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    private static int findIndexOfMinStartingFromIndex(int[] array, int fromIndex) {
        int minIndex = fromIndex;
        int minValue = array[fromIndex];

        for (int i = fromIndex + 1; i < array.length; i++) {
            int element = array[i];

            if(element <= minValue) {
                minValue = element;
                minIndex = i;
            }
        }

        return minIndex;
    }
}