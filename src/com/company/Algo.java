/*
This java class contains different algorithms implemented in the form of functions
Selection sort
Insertion sort
Merge sort
 */

package com.company;

public class Algo {

    protected int[] arr = {5,0,2,6,9};
    protected int size = arr.length;

    protected void print_arr() {
        for (int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    protected void swap_index(int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }


    public static void main(String[] args) {


    }
}
