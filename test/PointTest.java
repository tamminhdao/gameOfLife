import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by sabbas on 5/19/17.
 */
public class PointTest {

    @Test
    public void twoPointsAreEqualIfTheyAreBothZeroZero() {
        Point point1 = new Point(0,0);
        Point point2 = new Point(0,0);
        assertTrue(point1.isEqualTo(point2));
    }

    @Test
    public void twoPointsAreNotEqualIfTheXsAreDifferent() {
        Point point1 = new Point(1,0);
        Point point2 = new Point(0,0);
        assertFalse(point1.isEqualTo(point2));
    }

    @Test
    public void twoPointsAreNotEqualIfTheYsAreDifferent() {
        Point point1 = new Point(0,0);
        Point point2 = new Point(0,1);
        assertFalse(point1.isEqualTo(point2));
    }
}
