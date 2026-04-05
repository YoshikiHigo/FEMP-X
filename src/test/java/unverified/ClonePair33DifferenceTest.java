package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair33DifferenceTest {

    private final ClonePair33 subject = new ClonePair33();

    @Test
    void methodsDivergeOnDecimalSuffixInput() {
        assertEquals(Long.valueOf(42L), subject.method1("42.0"));
        assertNull(subject.method2("42.0"));
    }
}
