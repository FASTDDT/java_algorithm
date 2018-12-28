package algorithm.sort;

import grammar.Random_Test;


/**
 * <p>
 * 归并
 * </p>
 *
 * @author father
 * @ClassName MergeSort
 * @since 2018/12/28 10:25
 */
public class MergeSort {
    public static void simple(int a[], int left, int right) {
        if (left == right) {
            return;
        }
        System.out.println(left+"----------------------"+right);
        int mid = (left + right) / 2;
        simple(a, left, mid);
        simple(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int[] tmp = new int[right-left+1];
        int k = 0;
        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                tmp[k] = a[i];
                i++;
            } else {
                tmp[k] = a[j];
                j++;
            }
            k++;
        }
        while (j <= right) {
            tmp[k] = a[j];
            j++;
            k++;
        }
        while (i <= mid) {
            tmp[k] = a[i];
            i++;
            k++;
        }
        for (k=0;k<tmp.length;k++){
            a[k+left]=tmp[k];
        }

    }


    public static void main(String[] args) {
        int[] a = Random_Test.getRandom(13, 5, 100);
        for (int i : a) {
            System.out.printf(i + "\t");
        }
        System.out.println("\nsimple Bubble sort");
        simple(a, 0, a.length - 1);
        for (int i : a) {
            System.out.printf(i + "\t");
        }
    }

}
