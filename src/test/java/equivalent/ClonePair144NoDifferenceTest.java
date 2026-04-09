package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair144NoDifferenceTest {

    private final ClonePair144 subject = new ClonePair144();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertTrue(subject.method1(new byte[]{1, 2, 3}, new byte[]{1, 2, 3}));
        assertTrue(subject.method2(new byte[]{1, 2, 3}, new byte[]{1, 2, 3}));

        assertFalse(subject.method1(new byte[]{1, 2, 3}, new byte[]{1, 2, 4}));
        assertFalse(subject.method2(new byte[]{1, 2, 3}, new byte[]{1, 2, 4}));

        assertFalse(subject.method1(new byte[]{1, 2}, new byte[]{1, 2, 3}));
        assertFalse(subject.method2(new byte[]{1, 2}, new byte[]{1, 2, 3}));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, new byte[]{1}));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, new byte[]{1}));

        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(new byte[]{1}, null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(new byte[]{1}, null));
    }
}
