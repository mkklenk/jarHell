import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by micha on 14.05.17.
 */
public class UtilsTest {

    @Test
    public void testAdd1() {
        assertEquals(Integer.valueOf(4), Utils.multiply(2, 2));
        assertEquals(Integer.valueOf(12), Utils.multiply(6, 2));
        assertEquals(Integer.valueOf(84), Utils.multiply(6, 14));
    }
}
