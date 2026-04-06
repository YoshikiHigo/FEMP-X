package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8118DifferenceFindingTest {
    @Test
    void methodsTakeDifferentEndsAfterRepeating() {
        ClonePair8118 clonePair = new ClonePair8118();

        assertEquals("bab", clonePair.method1(3, "ab"));
        assertEquals("aba", clonePair.method2(3, "ab"));
    }
}
