/**
 * @author crkimberley on 20/09/2016.
 */
public class SupermarketTest {
    private Supermarket shop;

    public static void main(String[] args) {
        new SupermarketTest().launch();
    }

    private void launch() {
        for (int queueType=1; queueType<=5; queueType++) {
            shop = new Supermarket(queueType);
            System.out.println("PersonQueueImpl - type " + queueType);

            Person a = new Person("Alf", 6);
            Person b = new Person("Bertha", 13);
            Person c = new Person("Cynthia", 15);
            Person d = new Person("David", 17);
            Person k = new Person("Ken", 18);
            Person l = new Person("Leonard", 19);
            Person m = new Person("Mary", 64);
            Person u = new Person("Ursula", 65);
            Person v = new Person("Violet", 66);
            Person w = new Person("Walter", 99);

            System.out.println(shop);
            joinQueue(k);
            System.out.println(shop);
            joinQueue(m);
            System.out.println(shop);
            joinQueue(c);
            System.out.println(shop);
            joinQueue(a);
            System.out.println(shop);
            serve();
            System.out.println(shop);
            serve();
            System.out.println(shop);
            joinQueue(l);
            System.out.println(shop);
            joinQueue(b);
            System.out.println(shop);
            serve();
            System.out.println(shop);
            serve();
            System.out.println(shop);
            serve();
            System.out.println(shop);
            serve();
            System.out.println(shop);
            serve();
            System.out.println(shop);
            joinQueue(u);
            System.out.println(shop);
            serve();
            System.out.println(shop);
            joinQueue(d);
            System.out.println(shop);
        }
    }

    private void joinQueue(Person person) {
        System.out.println(person.getName() + ", " + person.getAge() + " joins the queue");
        shop.addPerson(person);
    }

    private void serve() {
        System.out.println(shop.getQueueSize() > 0 ? "Serving > " + shop.servePerson() : "Can't serve anybody - there is nobody in the queue");
    }
}
