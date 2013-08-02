package gradebook.model;

import java.util.Collection;

/**
 * A course class that extends ClassComponent, and is Storable.
 * @author Brice Rising
 * @version 1.0
 */

public class Course extends ClassComponent implements Storable {
    /**
     * The subject of the course.
     */
    private final String subject;
    /**
     * The ID of the course.
     */
    private final int courseID;
    /**
     * The course's name.
     */
    private final String name;
    /**
     * The course's preReq.
     */
    private final String[] preReq;
    /**
     * A collection of the course's class's.
     */
    private Collection<Class> classes;
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
     * The constructor for a Course object.
     * @param courseSubject The course's subject.
     * @param thisCourseID The course's ID.
     * @param courseName The course's name.
     * @param coursePreReq A collection of the course's prerequisites.
     * @param courseClasses a list of classes of this course.
     */
    public Course(final String courseSubject, final int thisCourseID,
            final String courseName, final String[] coursePreReq,
            final Collection<Class> courseClasses) {
        this.subject = courseSubject;
        this.courseID = thisCourseID;
        this.name = courseName;
        this.preReq = coursePreReq;
        this.classes = courseClasses;
    }
    /**
     * Calculates the average grade of this course.
     * @return returns the average grade.
     */
    public final double average() {
        double average = 0;
        for (Class eachClass:classes) {
            average += eachClass.average();
        }
        average = average / (classes.size());
        return average;
    }
    /**
     * Calculates the average letter grade of this course.
     * @return the average letter grade.
     */
    public final char letterGrade() {
        double average = average();
        return findLetterVal(average);
    }
    /**
     * Finds the letter value of a given average grade.
     * @param num value of grade.
     * @return letter value of grade.
     */
    private char findLetterVal(final double num) {
        if (LCA >= num && num >= LCB) {
            return A;
        } else if (LCB > num && num >= LCC) {
            return B;
        } else if (LCC > num && num >= LCD) {
            return C;
        } else if (LCD > num && num >= LCF) {
            return D;
        }
        return F;
    }
    /**
     * Creates a new class of this course.
     * @param sections the sections of the new class.
     */
    public final void createClass(final Collection<Section> sections) {
        Class nClass = new Class(sections);
        classes.add(nClass);
    }
    /**
     * Returns the subject of the class.
     * @return subject.
     */
    public final String getSubject() {
        return subject;
    }
    /**
     * Returns the courseID of the class.
     * @return courseID.
     */
    public final int getCourseID() {
        return courseID;
    }
    /**
     * Returns the name of the class.
     * @return name.
     */
    public final String getName() {
        return name;
    }
    /**
     * Returns the array of prereqs for this class.
     * @return preReq.
     */
    public final String[] getPreReq() {
        return preReq;
    }
    /**
     * Returns the key of this object.
     * @return this object's key.
     */
    public final String getKey() {
        int code = this.hashCode();
        return Integer.toString(code);
    }
}
