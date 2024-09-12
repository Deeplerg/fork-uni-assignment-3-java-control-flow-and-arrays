package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 5000, 6000, 8, 5, 3, 2000, 5, 1001, 3000, 7};
        int[] newArr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(newArr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if(arr == null)
            return null;

        int numberOfElementsMoreThan1000 = countMoreThan1000(arr);
        int[] newArray = new int[arr.length - numberOfElementsMoreThan1000];

        int lastAddedIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];

            if(element <= 1000)
                newArray[++lastAddedIndex] = element;
        }

        return newArray;
    }

    private static int countMoreThan1000(int[] array) {
        int count = 0;
        for (int n : array) {
            if(n > 1000)
                count++;
        }

        return count;
    }

    // "В решении не рекомендуется использовать ArrayList и другие коллекции Java."
    /*
    static int[] removeMoreThan1000WithStreams(int[] arr) {
        if(arr == null)
            return null;

        return Arrays.stream(arr).filter(x -> x <= 1000).toArray();
    }
    */
}