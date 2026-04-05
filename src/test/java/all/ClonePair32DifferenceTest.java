package all;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair32DifferenceTest {

    private final ClonePair32 subject = new ClonePair32();

    @Test
    void methodsDivergeOnDecimalSuffixInput() {
        assertEquals(Long.valueOf(42L), subject.method1("42.0"));
        assertNull(subject.method2("42.0"));
    }
}
