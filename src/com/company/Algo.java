/*
This java class contains different algorithms implemented in the form of functions
Selection sort
Insertion sort
 */

package com.company;

public class Algo {

    private int[] arr = {5,0,2,6,9};
    private int size = arr.length;

    private void print_arr() {
        for (int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void swap_index(int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    public void selection() {
        int min;
        for (int j = 0; j < size-1; j++) {

            min = j;
            for (int i= j+1; i < size; i++) {
                if(arr[min] > arr[i]) {
                    min = i;
                }
            }
            swap_index(min, j);
        }
        System.out.println("Array sorted using Selection sort:");
        print_arr();
    }

    public void insertion() {
        int temp, j;

        for ( int i=1; i<size; i++) {
            temp = arr[i];
            for ( j = i; j>0 && arr[j] < arr[j-1]; j--) {
                if (arr[j] < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                }
            }
            arr[j] = temp;
        }
        System.out.println("Array sorted by insertion sort:");
        print_arr();
    }

    public static void main(String[] args) {

        Algo alg = new Algo();
        alg.selection();
        alg.insertion();

    }
}
