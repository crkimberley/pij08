/**
 * @author crkimberley on 20/09/2016.
 */
// Singly-linked circular list used for the queue
public class PersonQueueImpl implements PersonQueue {
    private Node rear;
    private int size;

    public PersonQueueImpl() {
        rear = null;
        size = 0;
    }

    @Override
    public void insert(Person person) {
        size++;
        Node newNode = new Node(person);
        if (rear == null) {
            rear = newNode;
        } else {
            newNode.link = rear.link;
        }
        rear.link = newNode;
        rear = newNode;
    }

    @Override
    public Person retrieve() {
        // Should really throw an error when trying to retrieve from an empty queue (...later...)
        if (size == 0) {
            return new Person("NOBODY! QUEUE IS EMPTY!");
        }
        Node result = rear.link;
        if (rear == result) {
            rear = null;
        } else {
            rear.link = result.link;
        }
        size--;
        return result.person;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        if (rear != null) {
            StringBuilder sb = new StringBuilder("\nFRONT > ");
            queueStringBuilder(rear, sb).append(size);
            sb.append("\n");
            return sb.toString();
        } else {
            return "\nEMPTY QUEUE\n";
        }
    }

    // Recursive printing
    private StringBuilder queueStringBuilder(Node node, StringBuilder sb) {
        sb.append(node.link);
        sb.append(node.link != rear ? ", " : " < REAR • Queue size = ");
        if (node.link != rear) {
            queueStringBuilder(node.link, sb);
        }
        return sb;
    }

    private static class Node {
        private Person person;
        private Node link;

        public Node(Person person) {
            this.person = person;
            link = null;
        }

        public String toString() {
            return person.getName();
        }
    }
}