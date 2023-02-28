import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    //get id returns what the get id assigns
    //adds a grade correctly
    //make sure average is working
    private Student Andrea = null;
    private Student Bob = null;
    private List<Integer> emptyGrades;

    @Before
    public void initTestData(){
        Andrea = new Student(123456,"Andrea");

        Bob = new Student(234567,"Bob");

        emptyGrades= new ArrayList<>();
    }

    @Test
    public void testStudentCreation(){
        assertEquals(123456,Andrea.getId());
        assertEquals("Andrea", Andrea.getName());
        assertEquals(emptyGrades, Andrea.getGrades());
    }

    @Test
    public void testNoGrades(){
        assertTrue(emptyGrades.isEmpty());
        System.out.println(Bob.getGradeAverage());
    }

    @Test
    public void testAddTwoGrades(){
        Bob.addGrade(90);
        Bob.addGrade(100);

        assertEquals(Integer.valueOf(90),Bob.getGrades().get(0));
        assertEquals(Integer.valueOf(100), Bob.getGrades().get(1));
        assertEquals(2,Bob.getGrades().size());
    }

    @Test
    public void testGetGradeAverage(){
        Bob.addGrade(50);
        Bob.addGrade(60);
        Bob.addGrade(80);

        assertEquals(63.33,Bob.getGradeAverage(),.01);
    }

}
