/**
 * @author crkimberley on 22/09/2016.
 */
public class LinkedStringList {
    private StringNode head;
    private int length;

    public LinkedStringList() {
        head = null;
    }

    public void add(String value) {
        if (head == null) {
            head = new StringNode(value);
            length++;
        } else {
            add(head, value);
        }
    }

    private void add(StringNode node, String value) {
        if (node.next == null) {
            node.next = new StringNode(value);
            length++;
        } else {
            add(node.next, value);
        }
    }

    public void delete(String value) {
        if (head == null) {
            return;
        }
        if (head.value.equals(value)) {
            head = head.next;
            length--;
            return;
        }
        delete(head, value);
    }

    private void delete(StringNode node, String value) {
        if (node.next != null) {
            if (node.next.value.equals(value)) {
                node.next = node.next.next;
                length--;
                return;
            }
            delete(node.next, value);
        } else {
            System.out.println("Not found");
        }
    }

    public int getLength() {
        return length;
    }

    public String[] getValues() {
        String[] result = new String[length];
        StringNode temp = head;
        for (int i=0; i<length; i++) {
            result[i] = temp.value;
            temp = temp.next;
        }
        return result;
    }

    public void printList() {
        StringNode temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("List length = " + length);
    }

    private static class StringNode {
        private String value;
        private StringNode next;

        public StringNode(String value) {
            this.value = value;
            next = null;
        }
    }
}