package gradebook.model;
import java.util.Collection;
import java.util.ArrayList;

/**
 * Creates a student.
 * @author Brice Rising
 *
 */
public class Student implements Storable {
    /**
     * The name of the student.
     */
    private String name;
    /**
     * A collection of the student's grades.
     */
    private Collection<GradebookItem> grades;
    /**
     * The grading scheme used to grade the student's grades.
     */
    private GradeSchemeFactory gradeScheme;
    /**
     * Creates an instance of Student.
     * @param thisName name of the student
     * @param thisGrades grades the student got.
     * @param thisGradeScheme grading scheme for the student.
     */
    public Student(final String thisName,
            final Collection<GradebookItem> thisGrades,
            final GradeSchemeFactory thisGradeScheme) {
        this.name = thisName;
        this.grades = thisGrades;
        this.gradeScheme = thisGradeScheme;
    }
    /**
     * Creates an instance of Student.
     * @param thisName name of the student
     * @param thisGradeScheme grading scheme for the student
     */
    public Student(final String thisName,
            final GradeSchemeFactory thisGradeScheme) {
        this.name = thisName;
        this.grades = new ArrayList<GradebookItem>();
        this.gradeScheme = thisGradeScheme;
    }
    /**
     * Adds new grade to the collection.
     * @param item the new grade.
     */
    public final void addgrade(final GradebookItem item) {
        grades.add(item);
        gradeScheme.addGrade(item);
    }
    /**
     * Finds the students average in the class.
     * @return the students average.
     */
    public final double average() {
        return gradeScheme.average();
    }
    /**
     * Finds the student's average represented as a letter grade.
     * @return the student's letter grade.
     */
    public final char letterGrade() {
        return gradeScheme.letterGrade();
    }
    /**
     * Finds the key for this object.
     * @return a key for the object.
     */
    public final String getKey() {
        int code = this.hashCode();
        return Integer.toString(code);
    }
}
