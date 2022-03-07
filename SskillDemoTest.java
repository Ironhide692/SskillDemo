import static org.junit.Assert.*;
import org.junit.*;

public class SskillDemoTest{
    @Test
    public void multiplying(){
        assertEquals(27, SskillDemo.Multiply(3, 8)); //This will initially fail
    }
}
