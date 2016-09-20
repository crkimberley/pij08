/**
 * @author crkimberley on 20/09/2016.
 */
public class Brain {
    public String[] divideIntoWords(String text) {
        return text.split(" ");
    }

    public boolean isKnown(String word) {
        return false;
    }
}