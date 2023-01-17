package Fields;

import Fields.Prison;
import org.example.Player;
import org.junit.Test;

import java.rmi.server.RemoteServer;

import static org.junit.Assert.*;

public class PrisonTest {

    @Test
    public void Jailtest() {
        Prison prison = new Prison("Prison", 2);

        assertEquals("Prison", prison.getFieldName());
        assertEquals(2, prison.getBoardNumber());
    }

    @Test
    public void transportTest() {
        Prison prison = new Prison("Prison", 5);

        prison.transport();

        assertTrue(prison.onVisit);
    }

}
