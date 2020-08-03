package com.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProcessing {

//    public static void main(String[] args) {
//        int[] arr = new int[]{4, 1, 1, 1, 4};
//        System.out.println("main " + Arrays.toString(newArray(arr)));
//
//    }


    public int[] newArray(int arr[]) throws RuntimeException {
        int countNumber = 0;
        int serialNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                countNumber++;
                serialNumber = i;
            }
        }

        int[] newArray = new int[arr.length - serialNumber-1];

        if (countNumber != 0) {
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 4 && i > serialNumber) {
                    newArray[j] = arr[i];
                    j++;
                }
            }
            if(j == 0){
                newArray = new int[]{};
            }
        } else {
            throw new RuntimeException();
        }

        return newArray;
    }


    public boolean checkArray(int arr[]) {
        int countFor = 0;
        int countOne = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                countFor++;
            }
            if (arr[i] == 1) {
                countOne++;
            }
        }
        if (countFor != 0 && countOne != 0 && countFor + countOne == arr.length) {
            return true;
        }
        return false;
    }

}
