/**
 * @author crkimberley on 20/09/2016.
 */
public class SupermarketTest {
    private Supermarket shop;

    public static void main(String[] args) {
        new SupermarketTest().launch();
    }

    private void launch() {
        shop = new Supermarket();

        Person a = new Person("Alf");
        Person b = new Person("Bertha");
        Person c = new Person("Cynthia");
        Person d = new Person("Derek");
        Person e = new Person("Enid");
        Person f = new Person("Fred");
        Person g = new Person("Godfrey");

        System.out.println(shop);
        joinQueue(a);
        System.out.println(shop);
        joinQueue(b);
        joinQueue(c);
        joinQueue(d);
        System.out.println(shop);
        serve();
        serve();
        joinQueue(e);
        joinQueue(f);
        System.out.println(shop);
        serve();
        serve();
        serve();
        System.out.println(shop);
        serve();
        serve();
        System.out.println(shop);
        joinQueue(g);
        serve();
        System.out.println(shop);
    }

    private void joinQueue(Person person) {
        System.out.println(person.getName() + " joins the queue");
        shop.addPerson(person);
    }

    private void serve() {
        System.out.println(shop.getQueueSize() > 0 ? "Serving " + shop.servePerson() : "Can't serve anybody - there is nobody in the queue");
    }
}
