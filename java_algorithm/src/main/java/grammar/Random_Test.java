package grammar;

import java.util.Random;

/**
 * <p>
 * Discription
 * </p>
 *
 * @author father
 * @ClassName Random_Test
 * @since 2018/12/27 12:37
 */
public class Random_Test {
    public static int[] getRandom(int n,int begin,int end){
        int[] a=new int[n];
        Random r=new Random();
        if (begin>end){
            int tmp=begin;
            begin=end;
            end=tmp;
        }
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(Integer.MAX_VALUE)%(end-begin+1)+begin;
        }
        return a;
    }
}
