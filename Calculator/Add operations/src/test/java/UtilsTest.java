import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by micha on 14.05.17.
 */
public class UtilsTest {

    @Test
    public void testAdd1() {
        assertEquals(Integer.valueOf(4), Utils.add(2, 2));
        assertEquals(Integer.valueOf(8), Utils.add(6, 2));
        assertEquals(Integer.valueOf(20), Utils.add(6, 14));
    }
}
