/**
 * @author crkimberley on 20/09/2016.
 */
// Singly-linked circular list used for the queue
public class PersonQueueClusteredImpl implements PersonQueue {
    private Node front;
    private int size;

    public PersonQueueClusteredImpl() {
        front = null;
        size = 0;
    }

    @Override
    public void insert(Person person) {
        size++;
        Node newNode = new Node(person);
        if (front == null) {
            front = newNode;
        } else {
            // Old people go to the rear of their age band, which is at the front of the queue
            if (newNode.ageBand() > front.ageBand()) {
                newNode.link = front;
                front = newNode;
            } else {
                Node temp = front;
                // Other people queue at the rear of their age bands
                while (temp.link != null && newNode.ageBand() <= temp.link.ageBand()) {
                    temp = temp.link;
                }
                newNode.link = temp.link;
                temp.link = newNode;
            }
        }
    }

    @Override
    public Person retrieve() {
        if (front == null) {
            System.out.println("Empty list");
            return null;
        } else {
            size--;
            Node result = front;
            front = result.link;
            return result.person;
        }
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        if (front != null) {
            StringBuilder sb = new StringBuilder("FRONT > ");
            queueStringBuilder(front, sb).append(size);
            sb.append("\n");
            return sb.toString();
        } else {
            return "\nEMPTY QUEUE\n";
        }
    }

    // Recursive printing
    private StringBuilder queueStringBuilder(Node node, StringBuilder sb) {
        sb.append(node);
        sb.append(node.link != null ? ", " : " < REAR • Queue size = ");
        if (node.link != null) {
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

        private int ageBand() {
            if (person.getAge() >= 65) {
                return 2;
            } else if (person.getAge() >= 18) {
                return 1;
            }
            return 0;
        }

        public String toString() {
            return person.getName() + ", " + person.getAge();
        }
    }
}