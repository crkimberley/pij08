/**
 * @author crkimberley on 20/09/2016.
 */
public interface PersonQueue {

    /**
     * Adds another person to the queue
     */

    void insert(Person person);

    /**
     * Removes a person from the queue
     */

    Person retrieve();

    /**
     * Gets size of queue
     */

    int getSize();

}