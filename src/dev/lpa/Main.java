package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,6,84,354,74,54,74,354,87,1,48,3};
        reverse(array);
    }

    private static void reverse(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));

        for(int i = 0; i < (array.length / 2); i++) {
            int x = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = x;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
