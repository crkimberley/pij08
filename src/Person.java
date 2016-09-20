/**
 * @author crkimberley on 20/09/2016.
 */
/**
 * A person is defined by movement (as opposed to plants)
 * and by speech (as opposed to animals).
 */

public interface Person {

    /**
     * Move a distance in a straight line, given in meters.
     */

    void move(int distance);

    /**
     * Say something, printing it on screen.
     * It may or may not be a perfect transcription.
     */

    void say(String message);

}