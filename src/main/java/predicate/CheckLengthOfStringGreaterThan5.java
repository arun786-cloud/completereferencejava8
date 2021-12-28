package predicate;

import java.util.function.Predicate;

/**
 * @author arun on 12/28/21
 */
public class CheckLengthOfStringGreaterThan5 {
    public static void main(String[] args) {
        //to check the length of the string is greater than 5
        Predicate<String> isGreater = s -> s.length() > 5;

        final boolean isArunGreater = isGreater.test("arun");
        System.out.println(isArunGreater); //false

        final boolean adwiti = isGreater.test("adwiti");
        System.out.println(adwiti); //true
    }
}
