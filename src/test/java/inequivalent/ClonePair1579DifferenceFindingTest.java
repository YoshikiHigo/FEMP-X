package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair1579DifferenceFindingTest {

    private final ClonePair1579 subject = new ClonePair1579();

    @Test
    void methodsTreatSharedNullReferenceDifferently() {
        assertTrue(subject.method1(null, null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, null));
    }
}
