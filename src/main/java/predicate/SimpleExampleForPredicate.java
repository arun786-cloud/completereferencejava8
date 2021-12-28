package predicate;

import java.util.function.Predicate;

/**
 * @author arun on 12/28/21
 */
public class SimpleExampleForPredicate {
    public static void main(String[] args) {
        //to check if a number is greater than 10, we can use predicate.
        Predicate<Integer> isGreaterThan10 = I -> I > 10;

        //input the numbers
        final boolean isGreater = isGreaterThan10.test(100);
        System.out.println(isGreater); //true
        final boolean isLess = isGreaterThan10.test(5);
        System.out.println(isLess); //false
    }
}
