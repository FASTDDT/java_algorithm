package algorithm.sort;

import genericity.Swap;
import grammar.Random_Test;


/**
 * <p>
 * Discription
 * </p>
 *
 * @author father
 * @ClassName BubbleSort
 * @since 2018/12/27 12:42
 */
public class BubbleSort {

    public static int[] simple(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j + 1] > a[j]) {
                    int tmp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }

    public static int[] optimize(int[] a){
        for (boolean b=false;!b;b=!b){
            for (int j = a.length-1; j>0 ; j--) {
                if (a[j - 1] > a[j]) {
                    int tmp = a[j -1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                    b=true;
                }
            }
        }
        return a;
    }
}
