package gradebook.model;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class HashDatabaseTest {
    HashDatabase hmap = new HashDatabase();

    ArrayList<GradebookItem> items1 = new ArrayList<GradebookItem>();
    ArrayList<GradebookItem> items2 = new ArrayList<GradebookItem>();
    ArrayList<GradebookItem> items3 = new ArrayList<GradebookItem>();
    ArrayList<GradebookItem> items4 = new ArrayList<GradebookItem>();
    
    GradebookItem grade1 = new GradebookItem(90, new GradebookCategory("test",20));
    GradebookItem grade2 = new GradebookItem(90, new GradebookCategory("test",20));
    GradebookItem grade3 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade4 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade5 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade6 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade7 = new GradebookItem(90, new GradebookCategory("proj",12));
    
    GradebookItem grade8 = new GradebookItem(80, new GradebookCategory("test",20));
    GradebookItem grade9 = new GradebookItem(80, new GradebookCategory("test",20));
    GradebookItem grade10 = new GradebookItem(80, new GradebookCategory("proj",12));
    GradebookItem grade11 = new GradebookItem(80, new GradebookCategory("proj",12));
    GradebookItem grade12 = new GradebookItem(80, new GradebookCategory("proj",12));
    GradebookItem grade13 = new GradebookItem(80, new GradebookCategory("proj",12));
    GradebookItem grade14 = new GradebookItem(80, new GradebookCategory("proj",12));
    
    GradebookItem grade15 = new GradebookItem(70, new GradebookCategory("test",20));
    GradebookItem grade16 = new GradebookItem(70, new GradebookCategory("test",20));
    GradebookItem grade17 = new GradebookItem(70, new GradebookCategory("proj",12));
    GradebookItem grade18 = new GradebookItem(70, new GradebookCategory("proj",12));
    GradebookItem grade19 = new GradebookItem(70, new GradebookCategory("proj",12));
    GradebookItem grade20 = new GradebookItem(70, new GradebookCategory("proj",12));
    GradebookItem grade21 = new GradebookItem(70, new GradebookCategory("proj",12));

    GradebookItem grade22 = new GradebookItem(60, new GradebookCategory("test",20));
    GradebookItem grade23 = new GradebookItem(60, new GradebookCategory("test",20));
    GradebookItem grade24 = new GradebookItem(60, new GradebookCategory("proj",12));
    GradebookItem grade25 = new GradebookItem(60, new GradebookCategory("proj",12));
    GradebookItem grade26 = new GradebookItem(60, new GradebookCategory("proj",12));
    GradebookItem grade27 = new GradebookItem(60, new GradebookCategory("proj",12));
    GradebookItem grade28 = new GradebookItem(60, new GradebookCategory("proj",12));
    
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
        
        GradeSchemeFactory gradeScheme1 = new GradeSchemeFactory(items1,false);
        GradeSchemeFactory gradeScheme2 = new GradeSchemeFactory(items2,false);
        GradeSchemeFactory gradeScheme3 = new GradeSchemeFactory(items3,false);
        GradeSchemeFactory gradeScheme4 = new GradeSchemeFactory(items4,false);
        
        
        Student student1 = new Student("John",items1,gradeScheme1);
        Student student2 = new Student("John",items2,gradeScheme2);
        Student student3 = new Student("John",items3,gradeScheme3);
        Student student4 = new Student("Rick",items4,gradeScheme4);
        
        ArrayList<Student> section1 = new ArrayList<Student>();      
        ArrayList<Student> section2 = new ArrayList<Student>();
        ArrayList<Student> section3 = new ArrayList<Student>();   
        ArrayList<Student> section4 = new ArrayList<Student>();
        
        section1.add(student1);
        section1.add(student2);       
        section2.add(student3);
        section2.add(student4);
        section3.add(student2);
        section3.add(student3);
        section4.add(student1);
        section4.add(student4);
        
        ArrayList<Section> sections1 = new ArrayList<Section>();
        ArrayList<Section> sections2 = new ArrayList<Section>();
        
        Section realSection1 = new Section(section1);
        Section realSection2 = new Section(section2);
        Section realSection3 = new Section(section3);
        Section realSection4 = new Section(section4);
        
        sections1.add(realSection1);
        sections1.add(realSection2);
        sections2.add(realSection3);
        sections2.add(realSection4);
        
        Class courseTest1 = new Class(sections1);
        
        ArrayList<Class> classes = new ArrayList<Class>();
        classes.add(courseTest1);
        
        String[] preReqs = new String[]{"PreCalculus"};
        
        Course course = new Course("single variable calculus",1501,"calculus",preReqs,classes);
        
        hmap.add(courseTest1);
        hmap.add(course);
        hmap.add(grade1.getCategory());
        hmap.add(grade1);
        hmap.add(gradeScheme1);
        hmap.add(realSection1);
        hmap.add(student1);
        
        assertEquals(7,hmap.size());
        
        Storable getTest1 = hmap.get(courseTest1.getKey());
        Storable getTest2 = hmap.get(course.getKey());
        Storable getTest3 = hmap.get(grade1.getCategory().getKey());
        Storable getTest4 = hmap.get(grade1.getKey());
        Storable getTest5 = hmap.get(gradeScheme1.getKey());
        Storable getTest6 = hmap.get(realSection1.getKey());
        Storable getTest7 = hmap.get(student1.getKey());
        
        assertEquals(7,hmap.size());
        assertEquals(courseTest1,getTest1);
        assertEquals(course,getTest2);
        assertEquals(grade1.getCategory(),getTest3);
        assertEquals(grade1,getTest4);
        assertEquals(gradeScheme1,getTest5);
        assertEquals(realSection1,getTest6);
        assertEquals(student1,getTest7);
        
        getTest1 = hmap.remove(courseTest1.getKey());
        getTest2 = hmap.remove(course.getKey());
        getTest3 = hmap.remove(grade1.getCategory().getKey());
        getTest4 = hmap.remove(grade1.getKey());
        getTest5 = hmap.remove(gradeScheme1.getKey());
        getTest6 = hmap.remove(realSection1.getKey());
        getTest7 = hmap.remove(student1.getKey());
        
        assertEquals(0,hmap.size());
        assertEquals(courseTest1,getTest1);
        assertEquals(course,getTest2);
        assertEquals(grade1.getCategory(),getTest3);
        assertEquals(grade1,getTest4);
        assertEquals(gradeScheme1,getTest5);
        assertEquals(realSection1,getTest6);
        assertEquals(student1,getTest7);
    }
}
