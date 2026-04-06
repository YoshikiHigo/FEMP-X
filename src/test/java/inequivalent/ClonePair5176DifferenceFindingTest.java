package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5176DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5176 clonePair = new ClonePair5176();

        Date date = date(2000, Calendar.FEBRUARY, 1);

        assertEquals(29, clonePair.method1(date));
        assertEquals(28, clonePair.method2(date));
    }

    private static Date date(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(year, month, day);
        return calendar.getTime();
    }
}
