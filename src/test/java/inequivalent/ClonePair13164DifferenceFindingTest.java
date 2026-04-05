package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairGeneratedTestSupport.calendar;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair13164DifferenceFindingTest {

    private final ClonePair13164 subject = new ClonePair13164();

    @Test
    void methodsCompareDifferentCalendarFields() {
        assertTrue(subject.method1(calendar(86_400_000L), calendar(0L)));
        assertFalse(subject.method2(calendar(86_400_000L), calendar(0L)));
    }
}
