package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair1733NoDifferenceTest {

    private final ClonePair1733 subject = new ClonePair1733();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertTrue(subject.method1(new byte[]{1, 2, 3}, new byte[]{1, 2}));
        assertTrue(subject.method2(new byte[]{1, 2, 3}, new byte[]{1, 2}));

        assertFalse(subject.method1(new byte[]{1, 2, 3}, new byte[]{1, 4}));
        assertFalse(subject.method2(new byte[]{1, 2, 3}, new byte[]{1, 4}));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new byte[]{1}, new byte[]{1, 2}));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new byte[]{1}, new byte[]{1, 2}));
    }
}
