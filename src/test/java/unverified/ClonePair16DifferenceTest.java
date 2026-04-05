package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair16DifferenceTest {

    private final ClonePair16 subject = new ClonePair16();

    @Test
    void methodsDivergeOnDecimalSuffixInput() {
        assertNull(subject.method1("42.0"));
        assertEquals(Long.valueOf(42L), subject.method2("42.0"));
    }
}
