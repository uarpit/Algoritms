package Chapter2;

import com.company.Algo;

public class MergeSort extends Algo {

    private void divide(int i, int j) {
        int p = (i + j) / 2;
        if(i < j) {
            divide(i, p);
            divide(p+1, j);
            merge(i,p,j);
        }
    }

    private void merge(int x, int y, int z) {
        int l_size = y-x+1;
        int r_size = z-y;
        int[] left = new int[l_size];
        int[] right = new int[r_size];
        int t_size = l_size + r_size;

        // Create a copy of left half
        for (int i=0; i < l_size; i++) {
            left[i] = arr[x + i];
        }
        // Create a copy of right half
        for (int j=0; j < r_size; j++) {
            right[j] = arr[y + 1 + j];
        }

        for (int i=x, j=0, k=0; i < t_size; i++) {
            if (j >= l_size) {
                arr[x++] = right[k++];
            }
            else if(k >= r_size) {
                arr[x++] = left[j++];
            }
            else if(left[j] < right[k]) {
                arr[x++] = left[j++];
            }
            else {
                arr[x++] = right[k++];
            }
        }
    }

    public void mergeSort() {
        divide (0,size -1);
        System.out.println("Array sorted using Merge sort:");
        print_arr();
    }


    public static void main(String[] args) {

        MergeSort ms = new MergeSort();
        ms.mergeSort();

    }

}
