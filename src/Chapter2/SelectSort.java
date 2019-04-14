package Chapter2;

import com.company.Algo;

public class SelectSort extends Algo {

    public void selectionSort() {
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

    public static void main(String[] args) {

        SelectSort ss = new SelectSort();
        ss.selectionSort();

    }
}
