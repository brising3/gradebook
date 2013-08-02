package gradebook.model;

import java.util.Collection;


/**
 * A Class class.
 * @author Brice Rising
 * @version 1.0
 */
public class Class extends ClassComponent implements Storable {
    /**
     * A collection of the class's sections.
     */
    private Collection<Section> sections;
    /**
     * 4.0 GPA.
     */
    public static final double LCA = 100.0;
    /**
     * 3.5 GPA.
     */
    public static final double LCB = 90.0;
    /**
     * 2.5 GPA.
     */
    public static final double LCC = 80.0;
    /**
     * 1.5 GPA.
     */
    public static final double LCD = 70.0;
    /**
     * .5 GPA.
     */
    public static final double LCF = 60.0;
    /**
     * An A letter grade.
     */
    public static final char A = 'A';
    /**
     * A B letter grade.
     */
    public static final char B = 'B';
    /**
     * A C letter grade.
     */
    public static final char C = 'C';
    /**
     * A D letter grade.
     */
    public static final char D = 'D';
    /**
     * A F letter grade.
     */
    public static final char F = 'F';

    /**
     * The constructor for a Class object.
     * @param theSections a collection of sections.
     */
    public Class(final Collection<Section> theSections) {
        this.sections = theSections;
    }

    /**
     * Add a section with no students to this class.
     * @param section the section to be added.
     */
    public final void addSection(final Section section) {
        sections.add(section);
    }

    /**
     * Calculates the average grade of the class.
     * @return the class average represented as a double.
     */
    public final double average() {
        double average = 0;
        for (Section section:sections) {
            average += section.average();
        }
        average = average / (sections.size());
        return average;
    }

    /**
     * Calculates the class average represented as a letter grade.
     * @return the class averaged represented as a character.
     */
    public final char letterGrade() {
        double average = average();
        return findLetterVal(average);
    }

    /**
     * A helper method for finding the letter grade represented by an average.
     * @param num The letter value of an average.
     * @return the character representation of a grade.
     */
    private char findLetterVal(final double num) {
        if (LCA >= num && num >= LCB) {
            return A;
        }
        if (LCB > num && num >= LCC) {
            return B;
        }
        if (LCC > num && num >= LCD) {
            return C;
        }
        if (LCD > num && num >= LCF) {
            return D;
        }
        return F;
    }

    /**
     * The key representation of this object for storing.
     * @return This object's key.
     */
    public final String getKey() {
        int code = this.hashCode();
        return Integer.toString(code);
    }
}
