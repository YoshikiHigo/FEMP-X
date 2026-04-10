package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair171DifferenceFindingTest {

    private final ClonePair171 subject = new ClonePair171();

    @Test
    void methodsDisagreeOnNullArrayInputs() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, null));
        assertTrue(subject.method2(null, null));
    }
}
