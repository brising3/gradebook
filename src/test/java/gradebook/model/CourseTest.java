package gradebook.model;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class CourseTest {
    ArrayList<GradebookItem> items1 = new ArrayList<GradebookItem>();
    ArrayList<GradebookItem> items2 = new ArrayList<GradebookItem>();
    ArrayList<GradebookItem> items3 = new ArrayList<GradebookItem>();
    ArrayList<GradebookItem> items4 = new ArrayList<GradebookItem>();
    ArrayList<GradebookItem> items5 = new ArrayList<GradebookItem>();
    ArrayList<GradebookItem> items6 = new ArrayList<GradebookItem>();
    
    GradebookItem grade1 = new GradebookItem(100, new GradebookCategory("test",20));
    GradebookItem grade2 = new GradebookItem(100, new GradebookCategory("test",20));
    GradebookItem grade3 = new GradebookItem(100, new GradebookCategory("proj",12));
    GradebookItem grade4 = new GradebookItem(100, new GradebookCategory("proj",12));
    GradebookItem grade5 = new GradebookItem(100, new GradebookCategory("proj",12));
    GradebookItem grade6 = new GradebookItem(100, new GradebookCategory("proj",12));
    GradebookItem grade7 = new GradebookItem(100, new GradebookCategory("proj",12));
    
    GradebookItem grade8 = new GradebookItem(90, new GradebookCategory("test",20));
    GradebookItem grade9 = new GradebookItem(90, new GradebookCategory("test",20));
    GradebookItem grade10 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade11 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade12 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade13 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade14 = new GradebookItem(90, new GradebookCategory("proj",12));
    
    GradebookItem grade15 = new GradebookItem(80, new GradebookCategory("test",20));
    GradebookItem grade16 = new GradebookItem(80, new GradebookCategory("test",20));
    GradebookItem grade17 = new GradebookItem(80, new GradebookCategory("proj",12));
    GradebookItem grade18 = new GradebookItem(80, new GradebookCategory("proj",12));
    GradebookItem grade19 = new GradebookItem(80, new GradebookCategory("proj",12));
    GradebookItem grade20 = new GradebookItem(80, new GradebookCategory("proj",12));
    GradebookItem grade21 = new GradebookItem(80, new GradebookCategory("proj",12));

    GradebookItem grade22 = new GradebookItem(70, new GradebookCategory("test",20));
    GradebookItem grade23 = new GradebookItem(70, new GradebookCategory("test",20));
    GradebookItem grade24 = new GradebookItem(70, new GradebookCategory("proj",12));
    GradebookItem grade25 = new GradebookItem(70, new GradebookCategory("proj",12));
    GradebookItem grade26 = new GradebookItem(70, new GradebookCategory("proj",12));
    GradebookItem grade27 = new GradebookItem(70, new GradebookCategory("proj",12));
    GradebookItem grade28 = new GradebookItem(70, new GradebookCategory("proj",12));
    
    GradebookItem grade29 = new GradebookItem(60, new GradebookCategory("test",20));
    GradebookItem grade30 = new GradebookItem(60, new GradebookCategory("test",20));
    GradebookItem grade31 = new GradebookItem(60, new GradebookCategory("proj",12));
    GradebookItem grade32 = new GradebookItem(60, new GradebookCategory("proj",12));
    GradebookItem grade33 = new GradebookItem(60, new GradebookCategory("proj",12));
    GradebookItem grade34 = new GradebookItem(60, new GradebookCategory("proj",12));
    GradebookItem grade35 = new GradebookItem(60, new GradebookCategory("proj",12));
    
    GradebookItem grade36 = new GradebookItem(20, new GradebookCategory("test",20));
    GradebookItem grade37 = new GradebookItem(20, new GradebookCategory("test",20));
    GradebookItem grade38 = new GradebookItem(20, new GradebookCategory("proj",12));
    GradebookItem grade39 = new GradebookItem(20, new GradebookCategory("proj",12));
    GradebookItem grade40 = new GradebookItem(20, new GradebookCategory("proj",12));
    GradebookItem grade41 = new GradebookItem(20, new GradebookCategory("proj",12));
    GradebookItem grade42 = new GradebookItem(20, new GradebookCategory("proj",12));
    
    ArrayList<Student> section1 = new ArrayList<Student>();      
    ArrayList<Student> section2 = new ArrayList<Student>();
    ArrayList<Student> section3 = new ArrayList<Student>();   
    ArrayList<Student> section4 = new ArrayList<Student>(); 
    ArrayList<Student> section5 = new ArrayList<Student>(); 
    ArrayList<Student> section6 = new ArrayList<Student>(); 
    
    ArrayList<Section> sections1 = new ArrayList<Section>();
    ArrayList<Section> sections2 = new ArrayList<Section>();
    ArrayList<Section> sections3 = new ArrayList<Section>();
    ArrayList<Section> sections4 = new ArrayList<Section>();
    ArrayList<Section> sections5 = new ArrayList<Section>();
    ArrayList<Section> sections6 = new ArrayList<Section>();
    ArrayList<Section> sections7 = new ArrayList<Section>();
    ArrayList<Section> sections8 = new ArrayList<Section>();
    
    Class courseTest1 = new Class(sections1);
    
    ArrayList<Class> classes = new ArrayList<Class>();
    
    String[] preReqs = new String[]{"PreCalculus"};
    
    Course course = new Course("single variable calculus",1501,"calculus",preReqs,classes);
    
    @Test
    public void test() {
        items1.add(grade1);
        items1.add(grade2);
        items1.add(grade3);
        items1.add(grade4);
        items1.add(grade5);
        items1.add(grade6);
        items1.add(grade7);

        items2.add(grade8);
        items2.add(grade9);
        items2.add(grade10);
        items2.add(grade11);
        items2.add(grade12);
        items2.add(grade13);
        items2.add(grade14);
        
        items3.add(grade15);
        items3.add(grade16);
        items3.add(grade17);
        items3.add(grade18);
        items3.add(grade19);
        items3.add(grade20);
        items3.add(grade21);
        
        items4.add(grade22);
        items4.add(grade23);
        items4.add(grade24);
        items4.add(grade25);
        items4.add(grade26);
        items4.add(grade27);
        items4.add(grade28);
        
        items5.add(grade29);
        items5.add(grade30);
        items5.add(grade31);
        items5.add(grade32);
        items5.add(grade33);
        items5.add(grade34);
        items5.add(grade35);
        
        items6.add(grade36);
        items6.add(grade37);
        items6.add(grade38);
        items6.add(grade39);
        items6.add(grade40);
        items6.add(grade41);
        items6.add(grade42);
        
        GradeSchemeFactory gradeScheme1 = new GradeSchemeFactory(items1,false);
        GradeSchemeFactory gradeScheme2 = new GradeSchemeFactory(items2,false);
        GradeSchemeFactory gradeScheme3 = new GradeSchemeFactory(items3,false);
        GradeSchemeFactory gradeScheme4 = new GradeSchemeFactory(items4,false);
        GradeSchemeFactory gradeScheme5 = new GradeSchemeFactory(items5,false);
        GradeSchemeFactory gradeScheme6 = new GradeSchemeFactory(items6,false);
        
        Student student1 = new Student("Arnold",items1,gradeScheme1);
        Student student2 = new Student("Bob",items2,gradeScheme2);
        Student student3 = new Student("Cathy",items3,gradeScheme3);
        Student student4 = new Student("Donals",items4,gradeScheme4);
        Student student5 = new Student("Frank",items5,gradeScheme5);
        Student student6 = new Student("FrankMinus",items6,gradeScheme6);
        
        section1.add(student1);    
        section2.add(student2);
        section3.add(student3);
        section4.add(student4);
        section5.add(student5);
        section6.add(student6);
        
        Section realSection1 = new Section(section1);
        Section realSection2 = new Section(section2);
        Section realSection3 = new Section(section3);
        Section realSection4 = new Section(section4);
        Section realSection5 = new Section(section5);
        Section realSection6 = new Section(section6);
        
        sections1.add(realSection1);
        sections2.add(realSection2);
        sections3.add(realSection3);
        sections4.add(realSection4);
        sections5.add(realSection5);
        sections6.add(realSection6);
        
        classes.add(courseTest1);
        
        course.createClass(sections2);
        
        ArrayList<Class> classes1 = new ArrayList<Class>();
        classes1.add(new Class(sections1));
        ArrayList<Class> classes2= new ArrayList<Class>();
        classes2.add(new Class(sections2));
        ArrayList<Class> classes3= new ArrayList<Class>();
        classes3.add(new Class(sections3));
        ArrayList<Class> classes4= new ArrayList<Class>();
        classes4.add(new Class(sections4));
        ArrayList<Class> classes5= new ArrayList<Class>();
        classes5.add(new Class(sections5));
        ArrayList<Class> classes6= new ArrayList<Class>();
        classes6.add(new Class(sections6));
        
        
        Course course1 = new Course("course1",123,"multicourse",preReqs,classes1);
        Course course2 = new Course("course1",123,"multicourse",preReqs,classes2);
        Course course3 = new Course("course1",123,"multicourse",preReqs,classes3);
        Course course4 = new Course("course1",123,"multicourse",preReqs,classes4);
        Course course5 = new Course("course1",123,"multicourse",preReqs,classes5);
        Course course6 = new Course("course1",123,"multicourse",preReqs,classes6);

        assertTrue('A'==course1.letterGrade());
        assertTrue('A'==course2.letterGrade());
        assertTrue('B'==course3.letterGrade());
        assertTrue('C'==course4.letterGrade());
        assertTrue('D'==course5.letterGrade());
        assertTrue('F'==course6.letterGrade());
        assertTrue(95==course.average());
        assertTrue('A'==course.letterGrade());
        assertTrue(course.getName().equals("calculus"));
        assertEquals(1501,course.getCourseID());
        assertTrue(course.getSubject().equals("single variable calculus"));
        assertTrue(course.getPreReq().equals(preReqs));
        
        int hCode = course.hashCode();
        String key = Integer.toString(hCode);
        assertEquals(key,course.getKey());
        
    }

}
