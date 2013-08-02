package gradebook.model;
/**
 * Defines what every storable class needs to have.
 * @author Brice Rising
 *
 */
public interface Storable {
    /**
     * A function that deterimines the key of the object.
     * @return the key.
     */
    String getKey();
}
