package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair36DifferenceTest {

    private final ClonePair36 subject = new ClonePair36();

    @Test
    void methodsDivergeOnDecimalSuffixInput() {
        assertEquals(Long.valueOf(42L), subject.method1("42.0"));
        assertNull(subject.method2("42.0"));
    }
}
