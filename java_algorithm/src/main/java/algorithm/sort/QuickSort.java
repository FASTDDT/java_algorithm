package algorithm.sort;

import grammar.Random_Test;

/**
 * <p>
 * Discription
 * </p>
 *
 * @author father
 * @ClassName QuickSort
 * @since 2018/12/27 15:57
 */
public class QuickSort {
    public static void simple(int a[], int left, int right) {
        if (left >= right) {
            return;
        }

        int flag = a[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && a[j] >= flag) {
                j--;
            }
            a[i] = a[j];
            while (i < j && a[i] <= flag) {
                i++;
            }
            a[j] = a[i];

        }
        a[j] = flag;
        simple(a, left, i - 1);
        simple(a, i + 1, right);
    }

    public static void optimize(int[] a) {

    }

    public static void main(String[] args) {
        int[] a = Random_Test.getRandom(13, 5, 1000);
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
