package genericity;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

/**
 * <p>
 * Discription
 * </p>
 *
 * @author father
 * @ClassName Swap
 * @since 2018/12/27 13:31
 */

public class Swap<T> {
    public Swap(T[] ts, int a, int b){
        T tmp=ts[a];
        ts[a]=ts[b];
        ts[b]=tmp;
    }

}
