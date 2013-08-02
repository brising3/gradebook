package gradebook.model;
import java.util.HashMap;

/**
 * The database used to store the objects in this project.
 * @author Brice Rising
 *
 */
public class HashDatabase {
    /**
     * The hashmap.
     */
    private HashMap<String, Storable> hmap;
    /**
     * Instantiates the database.
     */
    public HashDatabase() {
        hmap = new HashMap<String, Storable>();
    }
    /**
     * Adds an item to the database.
     * @param item new item.
     */
    public final void add(final Storable item) {
        hmap.put(item.getKey(), item);
    }
    /**
     * Returns the item at a given key.
     * @param key given key
     * @return requested item.
     */
    public final Storable get(final String key) {
        return hmap.get(key);
    }
    /**
     * removes an item from the database.
     * @param key item to be removed.
     * @return a copy of the removed item.
     */
    public final Storable remove(final String key) {
        return hmap.remove(key);
    }
    /**
     * returns the size of the hashmap database.
     * @return hmap's size
     */
    public final int size() {
        return hmap.size();
    }
}
