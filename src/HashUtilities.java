/**
 * @author crkimberley on 22/09/2016.
 */
public class HashUtilities {
    public static int shortHash(int number) {
        return Math.abs(number % 1000);
    }
}
