package all;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair4DifferenceTest {

    private final ClonePair4 subject = new ClonePair4();

    @Test
    void methodsDivergeOnSecSuffixInput() {
        assertEquals(Long.valueOf(42L), subject.method1("42(sec)"));
        assertThrows(NumberFormatException.class, () -> subject.method2("42(sec)"));
    }
}
