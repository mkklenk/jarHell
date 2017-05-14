/**
 * Created by micha on 14.05.17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Calculator:");
        System.out.println("The result of 5 + 5 = " + new AddOperation().calculate(5,5));
        System.out.println("The result of 5 * 5 = " + new MultiplyOperation().calculate(5, 5));
    }
}
