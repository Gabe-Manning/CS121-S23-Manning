import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {
    Room room = new Room("classroom");

    @Test
    public void getName() {
        assertEquals("classroom", room.getName());
    }


    @Test
    public void checkContents() {
        assertFalse(room.checkContents());
    }

    @Test
    public void getContent() {
        assertEquals("", room.getContent());
    }
}