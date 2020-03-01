package Test;
import Main.*;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class TaskTest
{
    @Test
    public void setDescriptionTest()
    {
        Task t = new Task(new Creator("Alan", "Favre"), "Desc", new Date(), Status.OPEN, Resolution.DONE);
        t.setDescription("Nouvelle desc");
        assertEquals("Nouvelle desc", t.getDescription());
    }

    @Test
    public void setStatusTest()
    {
        Task t = new Task(new Creator("Alan", "Favre"), "Desc", new Date(), Status.OPEN, Resolution.DONE);
        t.setStatus(Status.CANCELED);
        assertEquals(Status.CANCELED, t.getStatus());
    }

    @Test
    public void setResolutionTest()
    {
        Task t = new Task(new Creator("Alan", "Favre"), "Desc", new Date(), Status.OPEN, Resolution.DONE);
        t.setResolution(Resolution.INGNORED);
        assertEquals(Resolution.INGNORED, t.getResolution());
    }

    @Test
    public void setCreatorTest()
    {
        Task t = new Task(new Creator("Alan", "Favre"), "Desc", new Date(), Status.OPEN, Resolution.DONE);
        t.setCreator(new Creator("Ruben", "Carvalho"));
        assertEquals("Ruben", t.getCreator().getFirst_name());
        assertEquals("Carvalho", t.getCreator().getLast_name());
    }
}