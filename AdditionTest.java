import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    void testAddNumbers() {
        Addition addition = new Addition();
        assertEquals(12, addition.addNumbers(5, 7));
        assertEquals(0, addition.addNumbers(-3, 3));
        assertEquals(-5, addition.addNumbers(-3, -2));
    }
}
