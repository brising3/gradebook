package gradebook.model;
import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;


public class StudentTest {
	ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
	
    GradebookItem grade1 = new GradebookItem(90, new GradebookCategory("test",20));
    GradebookItem grade2 = new GradebookItem(90, new GradebookCategory("test",20));
    GradebookItem grade3 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade4 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade5 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade6 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade7 = new GradebookItem(90, new GradebookCategory("proj",12));
    
    
    @Test
	public void test() {
		items.add(grade1);
		items.add(grade2);
		items.add(grade3);
		items.add(grade4);
		items.add(grade5);
		items.add(grade6);
		items.add(grade7);
		
		Student student = new Student("Jon",items,new GradeSchemeFactory(items,false));
		assertTrue(90==student.average());
	}
    @Test
    public void test2(){
        items.add(grade1);
        items.add(grade2);
        items.add(grade3);
        items.add(grade4);
        items.add(grade5);
        items.add(grade6);
        items.add(grade7);
        
        Student student = new Student("Jon",items,new GradeSchemeFactory(items,false));
        assertEquals('A',student.letterGrade());
    }
    @Test
    public void test3(){
        Student student = new Student("Jon",new GradeSchemeFactory(items,false));
        student.addgrade(grade1);
        student.addgrade(grade2);
        student.addgrade(grade3);
        student.addgrade(grade4);
        student.addgrade(grade5);
        student.addgrade(grade6);
        student.addgrade(grade7);
        
        assertEquals('A',student.letterGrade());
    }
    @Test
    public void test4(){
        items.add(grade1);
        items.add(grade2);
        items.add(grade3);
        items.add(grade4);
        items.add(grade5);
        items.add(grade6);
        items.add(grade7);
        Student student = new Student("Jon",items,new GradeSchemeFactory(items,false));
        int hCode = student.hashCode();
        String key = Integer.toString(hCode);
        assertEquals(key, student.getKey());
    }
}
