/**
 * @author crkimberley on 20/09/2016.
 */
public class PersonQueueImpl2 implements PersonQueue {
    private Node head;
    private int size;

    public PersonQueueImpl2() {
        head = null;
        size = 0;
    }

    @Override
    public void insert(Person person) {
        size++;
        insert(head, person);
    }

    // recursive method
    public void insert(Node node, Person person) {
        if (head == null) {
            head = new Node(person);
        } else {
            if (node.next == null) {
                node.next = new Node(person);
            } else {
                insert(node.next, person);
            }
        }
    }

    @Override
    public Person retrieve() {
        size--;
        if (head == null) {
            return null;
        } else {
            Node temp = head;
            head = head.next;
            return temp.person;
        }
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        if (head != null) {
            StringBuilder sb = new StringBuilder("\nFRONT > ");
            queueStringBuilder(head, sb).append(size);
            sb.append("\n");
            return sb.toString();
        } else {
            return "\nEMPTY QUEUE\n";
        }
    }

    // Recursive printing
    private StringBuilder queueStringBuilder(Node node, StringBuilder sb) {
        sb.append(node);
        sb.append(node.next != null ? ", " : " < REAR • Queue size = ");
        if (node.next != null) {
            queueStringBuilder(node.next, sb);
        }
        return sb;
    }

    private static class Node {
        private Person person;
        private Node next;

        public Node(Person person) {
            this.person = person;
            next = null;
        }

        public String toString() {
            return person.getName();
        }
    }
}
