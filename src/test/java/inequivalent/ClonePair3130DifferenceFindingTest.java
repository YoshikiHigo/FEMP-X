package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair3130DifferenceFindingTest {

    private final ClonePair3130 subject = new ClonePair3130();

    @Test
    void methodsTreatWhitespaceOnlyLocaleDifferently() {
        assertNotNull(subject.method1("\t"));
        assertNull(subject.method2("\t"));
    }
}
