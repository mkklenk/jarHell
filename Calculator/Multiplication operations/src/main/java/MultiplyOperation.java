/**
 * Created by micha on 14.05.17.
 */
public class MultiplyOperation implements Calculation<Integer>{

    public Integer calculate(Integer value1, Integer value2) {
        return Utils.multiply(value1, value2);
    }
}
