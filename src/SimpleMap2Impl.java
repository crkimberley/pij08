/**
 * @author crkimberley on 22/09/2016.
 */
public class SimpleMap2Impl implements SimpleMap2 {
    private static final int SIZE = 100;
    private LinkedStringList[] map;

    public SimpleMap2Impl() {
        map = new LinkedStringList[SIZE];
    }

    @Override
    public String put(int key, String name) {
        if (map[key] == null) {
            map[key] = new LinkedStringList();
        }
        map[key].add(name);
        return "";
    }

    @Override
    public String[] get(int key) {
        return map[key].getValues();
    }

    @Override
    public void remove(int key, String name) {
        if (map[key] != null) {
            map[key].delete(name);
        }
    }

    @Override
    public boolean isEmpty() {
        for (LinkedStringList l : map) {
            if (l != null && l.getLength() != 0) {
                return false;
            }
        }
        return true;
    }
}
