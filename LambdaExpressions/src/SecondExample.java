/**
 * Normal Java class
 */
public class SecondExample {

    public static void main(String[] args) {
        /**
         * Second example:
         * Here we are using our custom Interface.
         * It is still considered a functional interface, even though it has 3 methods.
         * That is because only 1 of them is abstract, the other two are default and static.
         * If there were two abstract methods in our interface, we would not be able to use it as a
         * assignment target for our lambda expression.
         * Note that we are not implementing the interface! (The normal way that is)
         * We are implementing the interface using LAMBDA EXPRESSIONS.
         * Note that we are not taking any arguments in the lambda expression!
         */

        MyInterface myInterface = () -> System.out.println("Hello world!");

        myInterface.methodOne();
    }
}
