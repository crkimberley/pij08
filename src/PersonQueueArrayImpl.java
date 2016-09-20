/**
 * @author crkimberley on 20/09/2016.
 */
public class PersonQueueArrayImpl implements PersonQueue {
    private Person[] personArray;
    private int size;
    private int INITIAL_ARRAY_SIZE = 5;

    public PersonQueueArrayImpl() {
        personArray = new Person[INITIAL_ARRAY_SIZE];
        size = 0;
    }

    @Override
    public void insert(Person person) {
        if (size == personArray.length) {
            enlargeArray();
        }
        personArray[size] = person;
        size++;
    }

    @Override
    public Person retrieve() {
        if (size == 0) {
            return null;
        }
        Person result = personArray[0];
        size--;
        System.arraycopy(personArray, 1, personArray, 0, size);
        personArray[size] = null;
        return result;
    }

    @Override
    public int getSize() {
        return size;
    }

    private void enlargeArray() {
        Person[] largerArray = new Person[size * 2];
        System.arraycopy(personArray, 0, largerArray, 0, size);
        personArray = largerArray;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(size > 0 ? "\nFRONT > " : "\nEmpty queue - size ");
        for (int i=0; i<size; i++) {
            sb.append(personArray[i].getName());
            sb.append(i < size - 1 ? ", " : " < REAR • Queue size = ");
        }
        sb.append(size);
        sb.append("\n");
        return sb.toString();
    }
}
