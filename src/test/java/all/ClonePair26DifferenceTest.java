package all;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair26DifferenceTest {

    private final ClonePair26 subject = new ClonePair26();

    @Test
    void methodsDivergeOnDecimalSuffixInput() {
        assertNull(subject.method1("42.0"));
        assertEquals(Long.valueOf(42L), subject.method2("42.0"));
    }
}
