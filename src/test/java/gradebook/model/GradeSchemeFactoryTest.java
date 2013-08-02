package gradebook.model;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class GradeSchemeFactoryTest {

    ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
    
    GradebookItem grade1 = new GradebookItem(90, new GradebookCategory("test",20));
    GradebookItem grade2 = new GradebookItem(90, new GradebookCategory("test",20));
    GradebookItem grade3 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade4 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade5 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade6 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade7 = new GradebookItem(90, new GradebookCategory("proj",12));
    GradebookItem grade7v2 = new GradebookItem(60, new GradebookCategory("proj",12));
    
    GradebookItem grade8 = new GradebookItem(80, new GradebookCategory("test",20));
    GradebookItem grade9 = new GradebookItem(80, new GradebookCategory("test",20));
    GradebookItem grade10 = new GradebookItem(80, new GradebookCategory("proj",12));
    GradebookItem grade11 = new GradebookItem(80, new GradebookCategory("proj",12));
    GradebookItem grade12 = new GradebookItem(80, new GradebookCategory("proj",12));
    GradebookItem grade13 = new GradebookItem(80, new GradebookCategory("proj",12));
    GradebookItem grade14 = new GradebookItem(80, new GradebookCategory("proj",12));
    
    GradebookItem grade15 = new GradebookItem(70, new GradebookCategory("test",20));
    GradebookItem grade16 = new GradebookItem(70, new GradebookCategory("test",20));
    GradebookItem grade17= new GradebookItem(70, new GradebookCategory("proj",12));
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
    
    GradebookItem grade29 = new GradebookItem(30, new GradebookCategory("test",20));
    GradebookItem grade30 = new GradebookItem(30, new GradebookCategory("test",20));
    GradebookItem grade31 = new GradebookItem(30, new GradebookCategory("proj",12));
    GradebookItem grade32 = new GradebookItem(30, new GradebookCategory("proj",12));
    GradebookItem grade33 = new GradebookItem(30, new GradebookCategory("proj",12));
    GradebookItem grade34 = new GradebookItem(30, new GradebookCategory("proj",12));
    GradebookItem grade35 = new GradebookItem(30, new GradebookCategory("proj",12));
    
    @Test
    public void test(){
    	ArrayList<GradebookItem> items1 = new ArrayList<GradebookItem>();
        ArrayList<GradebookItem> items2 = new ArrayList<GradebookItem>();
        ArrayList<GradebookItem> items3 = new ArrayList<GradebookItem>();
        ArrayList<GradebookItem> items4 = new ArrayList<GradebookItem>();
        ArrayList<GradebookItem> items5 = new ArrayList<GradebookItem>();
        
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
        
        GradeSchemeFactory gradeScheme1 = new GradeSchemeFactory(items1,false);
        GradeSchemeFactory gradeScheme2 = new GradeSchemeFactory(items2,false);
        GradeSchemeFactory gradeScheme3 = new GradeSchemeFactory(items3,false);
        GradeSchemeFactory gradeScheme4 = new GradeSchemeFactory(items4,false);
        GradeSchemeFactory gradeScheme5 = new GradeSchemeFactory(items5,false);
        
        assertTrue('A'==gradeScheme1.letterGrade());
        assertTrue('B'==gradeScheme2.letterGrade());
        assertTrue('C'==gradeScheme3.letterGrade());
        assertTrue('D'==gradeScheme4.letterGrade());
        assertTrue('F'==gradeScheme5.letterGrade());
        
    }
    @Test
    public void test1(){
        items.add(grade1);
        items.add(grade2);
        items.add(grade3);
        items.add(grade4);
        items.add(grade5);
        items.add(grade6);
        items.add(grade7);
        
        GradeSchemeFactory gradeScheme = new GradeSchemeFactory(items,false);
        assertTrue(90==gradeScheme.average());
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
        items.add(grade7v2);
        
        GradeSchemeFactory gradeScheme = new GradeSchemeFactory(items,true);
        assertTrue(gradeScheme.average()==90.0);
    }
    @Test
    public void test3(){
        items.add(grade1);
        items.add(grade2);
        items.add(grade3);
        items.add(grade4);
        items.add(grade5);
        items.add(grade6);
        items.add(grade7v2);
        
        GradeSchemeFactory gradeScheme = new GradeSchemeFactory(items,false);
        assertTrue('B'==gradeScheme.letterGrade());
    }
    @Test
    public void test4(){
        items.add(grade1);
        items.add(grade2);
        items.add(grade3);
        items.add(grade4);
        items.add(grade5);
        items.add(grade6);
        items.add(grade7v2);
        
        GradeSchemeFactory gradeScheme = new GradeSchemeFactory(items,false);
        int hCode = gradeScheme.hashCode();
        String key = Integer.toString(hCode);
        assertTrue(key.equals(gradeScheme.getKey()));
    }
}
