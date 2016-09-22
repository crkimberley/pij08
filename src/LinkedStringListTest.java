/**
 * @author crkimberley on 22/09/2016.
 */
public class LinkedStringListTest {
    public static void main(String[] args) {
        new LinkedStringListTest().launch();
    }

    private void launch() {
        LinkedStringList l = new LinkedStringList();

        l.add("1st item");
        l.add("2nd item");
        l.add("3rd item");
        l.printList();
        l.delete("2nd item");
        l.printList();
        l.delete("3rd item");
        l.printList();
        l.delete("1st item");
        l.printList();
        l.delete("a monkey");
        l.printList();
    }
}
