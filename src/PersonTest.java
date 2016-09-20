/**
 * @author crkimberley on 20/09/2016.
 */
public class PersonTest {
    public static void main(String[] args) {
        new PersonTest().launch();
    }

    private void launch() {
        Person adult = new AdultPerson();
        Person kid = new KidPerson();
        testPerson(adult);
        testPerson(kid);
    }

    private void testPerson(Person person) {
        System.out.println("Testing an implementation of Person");
        person.move(100);
        person.say("Well hello there!");
    }
}
