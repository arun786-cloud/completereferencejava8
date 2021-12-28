# Complete reference to Java 8

## Predicate

It's a boolean valued function.
It consists of a single abstract method.

    boolean test(T t);

Requirement 1 : check if a number is greater than 10.

        //to check if a number is greater than 10, we can use predicate.
        Predicate<Integer> isGreaterThan10 = I -> I > 10;
        
        //input the numbers
        final boolean isGreater = isGreaterThan10.test(100);
        System.out.println(isGreater); //true

        final boolean isLess = isGreaterThan10.test(5);
        System.out.println(isLess); //false
