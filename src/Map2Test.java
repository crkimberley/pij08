import java.util.Arrays;

/**
 * @author crkimberley on 22/09/2016.
 */
public class Map2Test {
    public static void main(String[] args) {
        new Map2Test().launch();
    }

    private void launch() {
        SimpleMap2 map = new SimpleMap2Impl();

        System.out.println("Empty?  -  " + map.isEmpty());

        System.out.println("Put Alf & Alison on key 11, Bert - 22, Carol - 33");

        map.put(11, "Alf");
        map.put(11, "Alison");
        map.put(22, "Bert");
        map.put(33, "Carol");

        System.out.println("Get key 11 values");
        System.out.println(Arrays.toString(map.get(11)));

        System.out.println("remove Alf");
        map.remove(11, "Alf");
        System.out.println("Empty?  -  " + map.isEmpty());

        System.out.println("Get key 11 values");
        System.out.println(Arrays.toString(map.get(11)));

        System.out.println("remove Alison");
        map.remove(11, "Alison");

        System.out.println("Get key 11 values");
        System.out.println(Arrays.toString(map.get(11)));

        System.out.println("Try to remove non-existent James from key 22");
        map.remove(22, "James");

        System.out.println("remove Bert");
        map.remove(22, "Bert");
        System.out.println("remove Carol");
        map.remove(33, "Carol");

        System.out.println("Empty?  -  " + map.isEmpty());
    }
}
