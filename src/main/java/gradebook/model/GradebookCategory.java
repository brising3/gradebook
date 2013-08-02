package gradebook.model;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Iterator;


/**
 * This class creates a category of grade used
 * to calculate a final grade.
 * @author Brice Rising
 */
public class GradebookCategory implements GradingScheme, Storable {
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
     * Max number of grades.
     */
    public static final int NUM = 100;
    /**
     * Name of the grading category.
     */
    private String name;
    /**
     * weight of each item in the grading category. ALL WEIGHTS
     * MUST ADD UP TO 100. The weighting is a measure of how much
     * each item weighs.
     */
    private int weight;
    /**
     * list of items in the category.
     */
    private PriorityQueue<GradebookItem> items;
    /**
     * Creates an instance of the GradebookCategory class.
     * @param thisName name of the category
     * @param thisWeight the weight of each item
     */
    public GradebookCategory(final String thisName,
            final int thisWeight) {
        this.name = thisName;
        this.weight = thisWeight;
        items = new PriorityQueue<GradebookItem>(NUM,
                new Comparator<GradebookItem>() {
            @Override
            public int compare(final GradebookItem o1, final GradebookItem o2) {
                double score = o2.getScore() - o1.getScore();
                if (score > 0) {
                    return 1;
                } else if (score < 0) {
                    return -1;
                }
                return 0;
            }
        });
    }
    /**
     * Adds an item to the category.
     * @param item new item
     */
    public final void addItem(final GradebookItem item) {
        items.add(item);
    }
    /**
     * Calculates the average of the items in this category.
     * @return the calculated average.
     */
    public final double average() {
        Iterator<GradebookItem> iterator = items.iterator();
        double average = 0;
        while (iterator.hasNext()) {
            average += iterator.next().getScore();
        }
        return average / items.size();
    }
    /**
     * Calcuates the average letter grade of the items
     * in this category.
     * @return letter grade
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
     * gets the weight of each item.
     * @return weight
     */
    public final int getWeight() {
        return weight;
    }
    /**
     * gets the name of the category.
     * @return name
     */
    public final String getName() {
        return name;
    }
    /**
     * Gets the key of this object.
     * @return this object's key
     */
    public final String getKey() {
        int code = this.hashCode();
        return Integer.toString(code);
    }
}
