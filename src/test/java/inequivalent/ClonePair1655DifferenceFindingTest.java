package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair1655DifferenceFindingTest {

    private final ClonePair1655 subject = new ClonePair1655();

    @Test
    void methodsHandleBooleanDifferently() {
        assertNull(subject.method1(Boolean.TRUE));
        assertEquals(-1, subject.method2(Boolean.TRUE));
    }
}
