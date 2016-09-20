/**
 * @author crkimberley on 20/09/2016.
 */
public class KidPerson implements Person {

    private int position;
    private Brain brain = new Brain();

    /**
     * Move a distance in a straight line, given in meters
     */
    @Override
    public void move(int distance) {
        crawl(distance);
        System.out.println("distance crawled = " + distance);
    }

    /**
     * Say something
     */
    @Override
    public void say(String message) {

        String finalMsg = getUnderstoodWords(message);
        System.out.println("Kid voice: " + message);
        System.out.println(finalMsg);
    }

    private void crawl(int distance) {

        for (int i = 0; i < distance; i++) {
            position++;
        }
    }

    private String getUnderstoodWords(String text) {

        String result = "";
        String[] words = brain.divideIntoWords(text);
        for (String word : words) {
            if (brain.isKnown(word)) {
                result = result + word;
                // if not, ignore it
            }
        }
        return result;
    }


    // ... other methods, including constructors, come here...
}