/**
 * A classic interface
 * The interface in Java cannot be instantiated (i.e. cannot be used to create objects).
 * The interface methods DON'T have a body (with the exception of default and static methods).
 * The interface methods are "public" and "abstract" by default (with the exception of default and static methods)
 * Default methods can have a body and DON'T need to be overriden in the class that implements the interface.
 * Static methods can have a body and DON'T need to be overriden in the class that implements the interface.
 * An interface that has only one method in called a functional interface.
 */
public interface MyInterface {

    public abstract void methodOne();


    public default void methodTwo() {
        System.out.println("Text from methodTwo");
    }

    public static void methodThree() {
        System.out.println("Text from methodThree");
    }
}
