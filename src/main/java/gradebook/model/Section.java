package gradebook.model;
import java.util.Collection;
import java.util.ArrayList;

/**
 * Creates a Section of a class.
 * @author Brice Rising
 *
 */
public class Section extends ClassComponent implements Storable {
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
    public static final double LCC = 80;
    /**
     * 1.5 GPA.
     */
    public static final double LCD = 70;
    /**
     * .5 GPA.
     */
    public static final double LCF = 60;
    /**
     * A collection of students in the section.
     */
    private Collection<Student> students;
    /**
     * Creates an instance of a Section object.
     * @param thisStudents the collection of students
     */
    public Section(final Collection<Student> thisStudents) {
        this.students = thisStudents;
    }
    /**
     * Creates an instance of a Section object with no students.
     */
    public Section() {
        this.students = new ArrayList<Student>();
    }
    /**
     * Adds a student to the section.
     * @param student the new student
     */
    public final void addStudent(final Student student) {
        students.add(student);
    }
    /**
     * Finds the average grade of the students in the section.
     * @return a double representation of the average.
     */
    public final double average() {
        double average = 0;
        for (Student student:students) {
            average += student.average();
        }
        average = average / (students.size());
        return average;
    }
    /**
     * Finds the letter grade representation of the average grade.
     * of the section
     * @return a character version of the average.
     */
    public final char letterGrade() {
        double average = average();
        return findLetterVal(average);
    }
    /**
     * Finds the letter representation.
     * @param num the number value.
     * @return the letter value.
     */
    private char findLetterVal(final double num) {
        if (LCA >= num && num >= LCB) {
            return 'A';
        } else if (LCB > num && num >= LCC) {
            return 'B';
        } else if (LCC > num && num >= LCD) {
            return 'C';
        } else if (LCD > num && num > LCF) {
            return 'D';
        }
        return 'F';
    }
    /**
     * Finds the key of this object.
     * @return the key of this object.
     */
    public final String getKey() {
        int code = this.hashCode();
        return Integer.toString(code);
    }
}
