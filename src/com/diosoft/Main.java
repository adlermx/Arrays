package com.diosoft;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] leftArray = {1,5,4,2,3,65,32,78};
        int[] rightArray = {3,5,24,4,1,2,34,45,32,5};

        int[] leftUnion = leftUnion(leftArray, rightArray);
        System.out.println(Arrays.toString(leftUnion));

        String[] a =new String[]{"asd","zcx","qwe"};
        List list1 = Arrays.asList(a);

        List list2 = Arrays.asList(new String[]{""});

        System.out.println("The list is : " +list2);

    }

    private static int[] leftUnion(int[] leftArray, int[] rightArray) {
        int lengthForUnionArray = 0;
        int placeInArray =0;//this number is used as count also

        lengthForUnionArray = leftArray.length +rightArray.length;
        int[] proceedArray = new int[lengthForUnionArray];

        Arrays.sort(leftArray);
        Arrays.sort(rightArray);

        for (int i = 0; i < leftArray.length; i++) {
            proceedArray[placeInArray]=leftArray[i];
            placeInArray++;
            for (int j = 0; j < rightArray.length; j++) {

                if (leftArray[i]==rightArray[j]){
                    proceedArray[placeInArray]=rightArray[j];
                    placeInArray++;
                }
            }

        }
        System.out.println(Arrays.toString(leftArray));
        System.out.println(Arrays.toString(rightArray));
        System.out.println(Arrays.toString(proceedArray));
        int[] leftUnion = new int[placeInArray];

        for (int i = 0; i < leftUnion.length; i++) {
            leftUnion[i]=proceedArray[i];
        }
        return leftUnion;
    }
}
