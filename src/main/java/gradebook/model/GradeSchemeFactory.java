package gradebook.model;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;


/**
 * Finds the average grade of items.
 * @author Brice Rising
 *
 */
public class GradeSchemeFactory implements GradingScheme, Storable {
    /**
     * Highest number a percentage can be.
     */
    public static final int MAX_NUM = 100;
    /**
     * Double representation of an A.
     */
    public static final double DOUBLE_A = 100.0;
    /**
     * Double representation of an B.
     */
    public static final double DOUBLE_B = 90.0;
    /**
     * Double representation of an C.
     */
    public static final double DOUBLE_C = 80.0;
    /**
     * Double representation of an D.
     */
    public static final double DOUBLE_D = 70.0;
    /**
     * Double representation of an F.
     */
    public static final double DOUBLE_F = 60.0;
    /**
     * Whether or not you hare to drop the lowest grade.
     */
    private boolean dropLowestGrade;
    /**
     * A priority queue of graded items.
     */
    private PriorityQueue<GradebookItem> grades;
    /**
     * Creates an instance of a grading scheme.
     * @param thisGrades a collection of grades.
     * @param thisDropLowestGrade a boolean determining whether or not you drop
     *        the lowest grade.
     */
    public GradeSchemeFactory(final Collection<GradebookItem> thisGrades,
            final boolean thisDropLowestGrade) {
        int size = thisGrades.size();
        if (size == 0) {
            size = MAX_NUM;
        }
        PriorityQueue<GradebookItem> items =
                new PriorityQueue<GradebookItem>(size,
                        new Comparator<GradebookItem>() {
            @Override
            public int compare(final GradebookItem o1, final GradebookItem o2) {
                double score = o1.getScore() - o2.getScore();
                if (score > 0) {
                    return 1;
                } else if (score < 0) {
                    return -1;
                }
                return 0;
            }
        });
        for (GradebookItem item: thisGrades) {
            items.add(item);
        }
        this.grades = items;
        this.dropLowestGrade = thisDropLowestGrade;
    }
    /**
     * Adds a grade to the collection of grades.
     * @param item the new item.
     */
    public final void addGrade(final GradebookItem item) {
        grades.add(item);
    }
    /**
     * Finds the average of the grades.
     * @return the average represented by a double.
     */
    public final double average() {
        double average = 0;
        GradebookItem lowestItem = grades.remove();
        if (!dropLowestGrade) {
            grades.add(lowestItem);
        }
        for (GradebookItem grade:grades) {
            double perc = grade.getScore();
            int weight = grade.getCategory().getWeight();
            double weightedGrade = (perc * weight) / MAX_NUM;
            average += weightedGrade;
        }
        if (dropLowestGrade) {
            grades.add(lowestItem);
        }
        return average;
    }
    /**
     * Finds the average grade represented as a character.
     * @return the char representation of the average.
     */
    public final char letterGrade() {
        double grade = average();
        if (DOUBLE_A >= grade && grade >= DOUBLE_B) {
            return 'A';
        } else if (DOUBLE_B > grade && grade >= DOUBLE_C) {
            return 'B';
        } else if (DOUBLE_C > grade && grade >= DOUBLE_D) {
            return 'C';
        } else if (DOUBLE_D > grade && grade >= DOUBLE_F) {
            return 'D';
        }
        return 'F';
    }
    /**
     * Returns the key of this object.
     * @return the key of this object.
     */
    public final String getKey() {
        int code = this.hashCode();
        return Integer.toString(code);
    }
}
