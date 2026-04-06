package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4385DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4385 clonePair = new ClonePair4385();

        Date first = date(2020, Calendar.JANUARY, 1);
        Date second = date(2020, Calendar.JANUARY, 2);

        assertFalse(clonePair.method1(first, second));
        assertTrue(clonePair.method2(first, second));
    }

    private static Date date(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(year, month, day);
        return calendar.getTime();
    }
}
