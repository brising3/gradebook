package gradebook.model;

/**
 * An abstract class defining what any component
 * of this object should be able to do.
 * @author Brice Rising
 * @version 1.0
 */
public abstract class ClassComponent implements Storable {
    /**
     * Finds the average of the grades held by the object.
     * @return a double representation of the object's average.
     */
    public abstract double average();
    /**
     * Finds the average of the grades held by this object
     * represented by a character.
     * @return a character representation of the object's average.
     */
    public abstract char letterGrade();
}
