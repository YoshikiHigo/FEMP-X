package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair155DifferenceFindingTest {

    private final ClonePair155 subject = new ClonePair155();

    @Test
    void methodsDisagreeOnNullArrayInputs() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, null));
        assertTrue(subject.method2(null, null));
    }
}
