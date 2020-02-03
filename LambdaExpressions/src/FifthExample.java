import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Normal Java class
 */
public class  FifthExample {

    public static void main(String[] args) {
        /**
         * Fifth example:
         * Creates an ArrayList and uses the forEach() method of the ArrayList class to perform a certain operation
         * for each element of the ArrayList.
         * Until and unless an overriding class has specified a concurrent modification policy,
         * the operation cannot modify the underlying source of elements so we can say that the behaviour
         * of this method is unspecified.
         * By definition: public void forEach(Consumer<? super E> action)
         * The method takes a parameter action which represents the action to be performed on each element.
         */

        ArrayList<Integer> Numbers = new ArrayList<>();

        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(4);

        Numbers.forEach(value -> System.out.println(value));

        //How I would say it in a sentence - Java lambda expressions are an easier way of implementing functional interfaces.
    }
}
