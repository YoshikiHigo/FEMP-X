package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair1610DifferenceFindingTest {

    private final ClonePair1610 subject = new ClonePair1610();

    @Test
    void methodsHandleLongNumberDifferently() {
        assertEquals(7, subject.method1(7L));
        assertNull(subject.method2(7L));
    }
}
