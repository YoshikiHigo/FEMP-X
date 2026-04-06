package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3597DifferenceFindingTest {

    private final ClonePair3597 subject = new ClonePair3597();

    @Test
    void methodsTreatSharedNullReferenceDifferently() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, null));
        assertTrue(subject.method2(null, null));
    }
}
