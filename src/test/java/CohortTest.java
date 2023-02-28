import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {
    private Student Andrea = null;
    private Student Bob = null;

    private List<Integer> emptyGrades;

    private Cohort cohort;

    @Before
    public void initTestData(){
        emptyGrades= new ArrayList<>();

        cohort = new Cohort();

        Andrea = new Student(123456,"Andrea");
        Andrea.addGrade(50);
        Andrea.addGrade(60);
        Andrea.addGrade(80);

        Bob = new Student(234567,"Bob");
        Bob.addGrade(50);
        Bob.addGrade(60);
        Bob.addGrade(80);

    }

    @Test
    public void testAddStudentToList(){
        cohort.addStudent(Andrea);
        cohort.addStudent(Bob);
        assertEquals(2,cohort.getStudents().size());
        assertEquals(Andrea,cohort.getStudents().get(0));
        assertEquals(Bob,cohort.getStudents().get(1));
    }

    @Test
    public void testGetCurrentListOfEmptyStudents(){
        assertTrue(cohort.getStudents().isEmpty());
    }

    @Test
    public void testGetCurrentListOfStudents(){
        Student [] students = {Andrea,Bob};
        cohort.addStudent(Andrea);
        cohort.addStudent(Bob);
        assertArrayEquals(students, cohort.getStudents().toArray(new Student[0]));
    }

    @Test
    public void testGetAverage(){
        cohort.addStudent(Andrea);
        cohort.addStudent(Bob);
        assertEquals(63.33,cohort.getCohortAverage(),.01);
    }

    @Test
    public void testGetAverageOnEmpty(){
        assertEquals(Double.NaN,cohort.getCohortAverage(),0);
    }

}
