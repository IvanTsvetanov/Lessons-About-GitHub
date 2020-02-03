import java.util.Comparator;

/**
 * Normal Java class.
 */
public class FirstExample {

    public static void main(String[] args) {

        /**
         * First example:
         * Using lambda expressions to more easily use the Comparator interface (Interface Comparator<T>).
         * The Comparator interface is functional and can therefore be used as a assignment target for a
         * lambda expression.
         * Lambda expressions are basically sugarcoating for your code.
         * Everything that can be done with a lambda expressions, can be done without one.
         *
         * The normal implementation of the Comparator interface should look something like this:
         *
         * Comparator<String> stringComparator = new Comparator<String> {
         *   @Override
         *     public int compare(String o1, String o2) {
         *       return o1.compareTo(o2);
         *     }
         *   };
         *
         *   As you can see, in this example the lambda expression takes two arguments (o1, o2).
         *   But it can take also take zero or one arguments. (See second example).
         */

        Comparator<String> stringComparatorLambda =
                (o1, o2) -> o1.compareTo(o2);

        int lambdaComparison = stringComparatorLambda.compare("hello", "world");
        System.out.println(lambdaComparison);

    }

}
