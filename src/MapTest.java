/**
 * @author crkimberley on 22/09/2016.
 */
public class MapTest {
    public static void main(String[] args) {
        new MapTest().launch();
    }

    private void launch() {
        SimpleMap map = new SimpleMapImpl();

        map.put(13, "Jake");
        map.put(27, "Poppy");
        map.put(13, "Doo Dah");
        System.out.println(map.get(27));
        map.remove(13);
        System.out.println("Empty? " + map.isEmpty());
        map.remove(27);
        System.out.println("Empty? " + map.isEmpty());
    }
}
