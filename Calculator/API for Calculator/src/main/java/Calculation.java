/**
 * Created by micha on 14.05.17.
 */
public interface Calculation<T> {

    /**
     * calculate the result
     * @param value1 val1
     * @param value2 val2
     * @return the result
     */
    public T calculate(T value1, T value2);

}
