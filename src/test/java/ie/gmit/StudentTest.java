package ie.gmit;//  Jack Sheridan
//  G00326495
//  addStudent class Test
//  09-03-21

import ie.gmit.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    private Student s1;

    @BeforeEach
    void init() { s1 = new Student("Jack", "G00@gmit.ie"); }

    @Test
    void testName() {
        new Student("Jack", "G00@gmit.ie");
        assertEquals("Invalid name", e.getMessage());
    }

    @Test
    void testEmail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Student("Jack", ""));
        assertEquals("Invalid email", e.getMessage());
    }

    @Test
    void testNameFalse() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Student("", "G00@gmit.ie"));
        assertEquals("Invalid name", e.getMessage());
    }

    @Test
    void testEmailFalse() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Student("Jack", ""));
        assertEquals("Invalid email", e.getMessage());
    }

    //Student student = new Student();
//        Student s1 = new Student("Jack Sheridan", "G00@gmit.ie");
//        //assertEquals(60, result, 0);


//    @Test
//    void testAddFalse() {
//        Student student = new Student();
//        double result = Student.Student(10, 50);
//        assertThrows(IllegalArgumentException.class,() -> Student.add(1, 5));
//    }
}
