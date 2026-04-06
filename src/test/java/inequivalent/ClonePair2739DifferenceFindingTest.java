package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair2739DifferenceFindingTest {

    private final ClonePair2739 subject = new ClonePair2739();

    @Test
    void methodsTreatSharedNullReferenceDifferently() {
        assertTrue(subject.method1(null, null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, null));
    }
}
