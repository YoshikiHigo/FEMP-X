package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3728DifferenceFindingTest {

    private final ClonePair3728 subject = new ClonePair3728();

    @Test
    void methodsTreatBlankAndNullDifferently() {
        assertTrue(subject.method1(" ", null));
        assertFalse(subject.method2(" ", null));
    }
}
