/**
 * Normal Java class
 */
public class ThirdExample {

    public static void main(String[] args) {
        /**
         * Third example:
         * Similar to the second example,
         * but this time we will demonstrate how to use all the methods from the functional interface.
         * Only one of the interface methods is overriden, because it is the only one which is abstract.
         * The other methods (which are default) can also be called using the lambda expression!
         */

        MyInterface myInterface = () -> System.out.println("Hello World!");

        myInterface.methodOne();

        myInterface.methodTwo();

        MyInterface.methodThree();

    }
}
