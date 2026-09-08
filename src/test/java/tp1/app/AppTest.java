package tp1.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void TestFeatureAdd() {

        int a = 4;
        int b = 2;

        int resultat = new Add().add(a, b);

        assertEquals(6, resultat, "2 + 4 doit être égal à 6");
    }
    
    @Test
    public void testSub() {
        int a = 10;
        int b = 5;
        assertEquals(Sub.sub(a,b), 5);
    }
}
