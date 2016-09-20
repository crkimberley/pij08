/**
 * @author crkimberley on 20/09/2016.
 */
public class Supermarket {
    private PersonQueueImpl queue;

    public Supermarket() {
        queue = new PersonQueueImpl();
    }
    public void addPerson(Person person) {
        queue.insert(person);
    }

    public Person servePerson() {
        return queue.retrieve();
    }

    public int getQueueSize() {
        return queue.getSize();
    }

    public String toString() {
        return queue.toString();
    }
}
