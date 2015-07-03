package com.company.psoloid;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        array[2] = 10;
        System.out.println(array[2]);
        int[][] tdArray = new int[8][];
//        int[][][] tdArray = new int[8][][];
        tdArray[0] = new int[10];
        tdArray[1] = new int[1];
        System.out.println(tdArray[2].length);

        for (int arr[] : tdArray) {
            for (int el : arr) {

            }

            String[] students ={"Ivanov","Petrov","Sidorov","Aleshkin"};
            int[][] mark = new int[students.length][34];
            mark[0][3] = 5;


        }
    }
}