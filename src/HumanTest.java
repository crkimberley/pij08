/**
 * @author crkimberley on 20/09/2016.
 */
public class HumanTest {
    public static void main(String[] args) {
        new HumanTest().launch();
    }

    private void launch() {
        Human adult = new AdultHuman();
        Human kid = new KidHuman();
        testHuman(adult);
        testHuman(kid);
    }

    private void testHuman(Human human) {
        System.out.println("Testing an implementation of Human");
        human.move(100);
        human.say("Well hello there!");
    }
}
