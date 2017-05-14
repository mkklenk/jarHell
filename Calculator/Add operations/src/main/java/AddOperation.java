/**
 * Created by micha on 14.05.17.
 */
public class AddOperation implements Calculation<Integer>{

    public Integer calculate(Integer value1, Integer value2) {
        return Utils.add(value1, value2);
    }
}
