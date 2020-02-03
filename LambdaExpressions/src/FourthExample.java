/**
 * Normal Java class
 */
public class FourthExample {

    public static String staticText = "I am a static text!";

    public String notSoStaticText = "I am not a static text!";

    public static void main(String[] args) {
        /**
         * Fourth example:
         * Lambda expressions can use local variables in them, BUT
         * the local variables must be effectively be considered as final.
         * That means that they don't have to be declared final, but no changes must be made to them,
         * after they have been added in the lambda expression, or the compiler will not work!
         * (Try removing the commented line in which the "text" variable is changed)
         * But there is another exception, and that is for static variables!
         * If a static variable is used in a lambda expression, it CAN be changed, BEFORE the method is invoked!
         * (If you try to uncomment the "staticText" variable, it will still work!
         * But what is displayed is the changed version of the static variable!)
         */
        String text = "Hello";


        MyInterface myInterface = () -> System.out.println(text + " World! " + staticText);

        //staticText = "Changes to the static text!";

        myInterface.methodOne();

        //text = "Some change to the text";
    }
}
