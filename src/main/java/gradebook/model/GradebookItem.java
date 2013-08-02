package gradebook.model;


/**
 * This creates an item for the gradebook.
 * @author Brice Rising
 *
 */
public class GradebookItem implements Storable {
    /**
     * Category of the item.
     */
    private GradebookCategory category;
    /**
     * Score achieved for this assignment.
     */
    private double score;
    /**
     * Creates an instance of the GradebookItem class.
     * @param thisScore score achieved on the assignment
     * @param thisCategory category of the assignment.
     */
    public GradebookItem(final double thisScore,
            final GradebookCategory thisCategory) {
        this.score = thisScore;
        this.category = thisCategory;
    }
    /**
     * Gets the score of the item.
     * @return score
     */
    public final double getScore() {
        return score;
    }
    /**
     * Gets the category of the item.
     * @return category
     */
    public final GradebookCategory getCategory() {
        return category;
    }
    /**
     * Returns the key of this object.
     * @return the key
     */
    public final String getKey() {
        int code = this.hashCode();
        return Integer.toString(code);
    }
}
