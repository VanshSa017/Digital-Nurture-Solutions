import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    App obj= new App();
    @Test
    void testAddition() {
        assertEquals("avaj",obj.reverse("java"));
    }    
}
