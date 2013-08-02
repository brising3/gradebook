package gradebook.model;
import static org.junit.Assert.*;

import org.junit.Test;


public class GradebookItemTest {
    
    GradebookCategory category = new GradebookCategory("test",20);
    GradebookItem item = new GradebookItem(50,category);
    
    @Test
    public void test() {
        assertTrue(category.equals(item.getCategory()));
        assertTrue(50==item.getScore());
        
        int hCode = item.hashCode();
        String key = Integer.toString(hCode);
        assertEquals(key,item.getKey());
    }

}
