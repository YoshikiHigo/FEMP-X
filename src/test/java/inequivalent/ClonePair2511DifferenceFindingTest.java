package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair2511DifferenceFindingTest {

    private final ClonePair2511 subject = new ClonePair2511();

    @Test
    void methodsTreatTrailingPointZeroDifferently() {
        assertEquals((short) 1, subject.method1("1.0"));
        assertNull(subject.method2("1.0"));
    }
}
