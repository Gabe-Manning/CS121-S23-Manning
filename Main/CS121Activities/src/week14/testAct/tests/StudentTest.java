import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student = new Student("Jeff", "Foster", 13524, "Computer Science", "Freshman");

    @org.junit.jupiter.api.Test
    void getID() {
        assertEquals(13524, student.getID());
    }

    @org.junit.jupiter.api.Test
    void getMajor() {
        assertEquals("Computer Science", student.getMajor());
    }
