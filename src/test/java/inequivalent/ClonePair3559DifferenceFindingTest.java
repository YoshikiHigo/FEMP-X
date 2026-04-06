package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair3559DifferenceFindingTest {

    private final ClonePair3559 subject = new ClonePair3559();

    @Test
    void methodsHandleNumericStringDifferently() {
        assertEquals(1.0, subject.method1("1.0"));
        assertNull(subject.method2("1.0"));
    }
}
