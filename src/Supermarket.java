/**
 * @author crkimberley on 20/09/2016.
 */
public class Supermarket {
    private PersonQueue queue;

    public Supermarket(int PersonQueueImplType ) {
        switch (PersonQueueImplType) {
            case 1: queue = new PersonQueueImpl();
                break;
            case 2: queue = new PersonQueueImpl2();
                break;
            case 3: queue = new PersonQueueArrayImpl();
                break;
        }
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
