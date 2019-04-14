package Chapter2;

import com.company.Algo;

public class InsertSort extends Algo {

    public void insertionSort() {
        int temp, j;

        for ( int i=1; i<size; i++) {
            temp = arr[i];
            for ( j = i; j>0 && temp < arr[j-1]; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
        System.out.println("Array sorted by insertion sort:");
        print_arr();
    }

    public static void main(String[] args) {

        InsertSort is = new InsertSort();
        is.insertionSort();

    }
}
