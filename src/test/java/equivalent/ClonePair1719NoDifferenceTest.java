package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair1719NoDifferenceTest {

    private final ClonePair1719 subject = new ClonePair1719();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertTrue(subject.method1(new byte[]{1, 2, 3}, new byte[]{1, 2}));
        assertTrue(subject.method2(new byte[]{1, 2, 3}, new byte[]{1, 2}));

        assertFalse(subject.method1(new byte[]{1, 2, 3}, new byte[]{1, 4}));
        assertFalse(subject.method2(new byte[]{1, 2, 3}, new byte[]{1, 4}));

        assertFalse(subject.method1(new byte[]{1}, new byte[]{1, 2}));
        assertFalse(subject.method2(new byte[]{1}, new byte[]{1, 2}));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, new byte[]{1}));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, new byte[]{1}));
    }
}
