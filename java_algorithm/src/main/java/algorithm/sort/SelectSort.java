package algorithm.sort;

import grammar.Random_Test;

/**
 * <p>
 * Discription
 * </p>
 *
 * @author father
 * @ClassName SelectSort
 * @since 2018/12/27 14:13
 */
public class SelectSort {
    public static int[] simple(int a[]) {
        int tmp;
        for (int i = 0; i < a.length; i++) {
            tmp = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[tmp]) {
                    tmp = j;
                }
            }
            if (i < tmp) {
                int t = a[tmp];
                a[tmp] = a[i];
                a[i] = t;
            }

        }
        return a;
    }

    public static int[] optimize(int[] a) {
        int end = a.length/ 2;
        int max, min;
        for (int i = 0; i < end; i++) {
            max = min = i;
            for (int j = i + 1; j < a.length - i; j++) {

                if (a[j] > a[max]) {
                    max = j;
                } else if (a[j] < a[min]) {
                    min = j;
                }
            }
            int tmp;
            if (a.length - 1 - i != max) {
                tmp = a[max];
                a[max] = a[a.length - i - 1];
                a[a.length - i - 1] = tmp;
            }
            if (i != min) {
                tmp = a[min];
                a[min] = a[i];
                a[i] = tmp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = Random_Test.getRandom(10, 5, 100);
        for (int i : a) {
            System.out.printf(i + "\t");
        }
        System.out.println("\nsimple Bubble sort");
        a = optimize(a);
        for (int i : a) {
            System.out.printf(i + "\t");
        }
    }
}
