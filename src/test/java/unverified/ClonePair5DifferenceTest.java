package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair5DifferenceTest {

    private final ClonePair5 subject = new ClonePair5();

    @Test
    void methodsDivergeOnSecSuffixInput() {
        assertEquals(Long.valueOf(42L), subject.method1("42(sec)"));
        assertThrows(NumberFormatException.class, () -> subject.method2("42(sec)"));
    }
}
