package all;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair34DifferenceTest {

    private final ClonePair34 subject = new ClonePair34();

    @Test
    void methodsDivergeOnDecimalSuffixInput() {
        assertEquals(Long.valueOf(42L), subject.method1("42.0"));
        assertNull(subject.method2("42.0"));
    }
}
