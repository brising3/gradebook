package gradebook.model;
/**
 * An interface for objects used for grading.
 * @author Brice Rising
 *
 */
public interface GradingScheme extends Storable {
    /**
     * Finds the average grade of the items it contains.
     * @return the average grade
     */
    double average();
    /**
     * Finds the average grade of the items it contains
     * represented by a letter.
     * @return the letter grade.
     */
    char letterGrade();
}
