/**
 * @author crkimberley on 20/09/2016.
 */
public class AdultHuman implements Human {

    private int situation;
    private int energy;
    private Leg leftLeg = new Leg();
    private Leg rightLeg = new Leg();

    /**
     * Move a distance in a straight line, given in meters
     */
    @Override
    public void move(int distance) {
        String moved;
        if (rightLeg.isHealthy() && leftLeg.isHealthy()) {
            run(distance);
            moved = "run";
        } else {
            walk(distance);
            moved = "walked";
        }
        System.out.println("distance " + moved + " = " + distance);
    }

    /**
     * Say something
     */
    @Override
    public void say(String message) {

        System.out.println("Adult voice: " + message);
    }

    private void run(int distance) {

        situation = situation + distance;
        energy--;
    }

    private void walk(int distance) {

        for (int i = 0; i < distance; i++) {
            situation++;
        }
    }

// ...other methods, including constructors, come here...

}