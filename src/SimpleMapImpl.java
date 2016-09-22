/**
 * @author crkimberley on 22/09/2016.
 */
public class SimpleMapImpl implements SimpleMap {
    private static final int SIZE = 100;
    private String[] map;

    public SimpleMapImpl() {
        map = new String[SIZE];
    }

    @Override
    public void put(int key, String name) {
        if (map[key] == null) {
            map[key] = name;
            System.out.println(name + " added to map - key: " + key);
        } else {
            System.out.println("Key " + key + " is already in the map");
        }
    }

    @Override
    public String get(int key) {
        return map[key];
    }

    @Override
    public void remove(int key) {
        map[key] = null;
        System.out.println("Key " + key + " removed");
    }

    @Override
    public boolean isEmpty() {
        for (String str : map) {
            if (str != null) {
                return false;
            }
        }
        return true;
    }
}
