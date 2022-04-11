/**
 * Java 1. Homework 3
 *
 * @author Ivan
 * @version 29.03.2022
 */

import java.util.Arrays;

class HomeWork3 {

    public static void main(String[] args) {
        replaceInteger();
        emptyArray();
        changeArray();
        createSquareArray();
        minmaxArray();
    }

    static void replaceInteger() {
        int[] arr = {1, 1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void emptyArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void createSquareArray() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || j == (4 - i - 1)) {
                    System.out.print("1 ");
                } else if (i < j || i > j) {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    static void minmaxArray(){
        int [] arr = {11, 19, 480, 5, 98, 9};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i != arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}

