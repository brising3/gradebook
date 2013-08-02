package gradebook.model;
import static org.junit.Assert.*;

import org.junit.Test;


public class GradebookCategoryTest {

	GradebookCategory category1 = new GradebookCategory("test",40);
	GradebookCategory category2 = new GradebookCategory("hw",20);
	GradebookCategory category3 = new GradebookCategory("quiz",10);
	GradebookCategory category4 = new GradebookCategory("final",30);
	GradebookCategory category5 = new GradebookCategory("extraCredit",5);
    GradebookItem grade1 = new GradebookItem(90, new GradebookCategory("test",20));
    GradebookItem grade2 = new GradebookItem(90, new GradebookCategory("test",20));
    GradebookItem grade3 = new GradebookItem(82, new GradebookCategory("hw",20));
    GradebookItem grade4 = new GradebookItem(80, new GradebookCategory("hw",20));
    GradebookItem grade5 = new GradebookItem(70, new GradebookCategory("quiz",10));
    GradebookItem grade6 = new GradebookItem(72, new GradebookCategory("quiz",10));
    GradebookItem grade7 = new GradebookItem(65, new GradebookCategory("final",30));
    GradebookItem grade8 = new GradebookItem(40, new GradebookCategory("extraCredit", 5));
    
    
    @Test
    public void test() {
        category1.addItem(grade1);
        category1.addItem(grade2);
        category2.addItem(grade3);
        category2.addItem(grade4);
        category3.addItem(grade5);
        category3.addItem(grade6);
        category4.addItem(grade7);
        category5.addItem(grade8);
        
        assertTrue(90.0==category1.average());
        assertTrue('A'==category1.letterGrade());
        
        assertTrue('B'==category2.letterGrade());
        assertTrue('C'==category3.letterGrade());
        assertTrue('D'==category4.letterGrade());
        assertTrue('F'==category5.letterGrade());
        
        assertTrue(40==category1.getWeight());
        assertEquals("test",category1.getName());
        
        int hCode = category1.hashCode();
        String key = Integer.toString(hCode);
        assertEquals(key, category1.getKey());
    }

}
