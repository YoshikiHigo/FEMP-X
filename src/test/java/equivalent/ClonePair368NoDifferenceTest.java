package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair368NoDifferenceTest {

    private final ClonePair368 subject = new ClonePair368();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        byte[] same = {1, 2, 3};
        assertTrue(subject.method1(same, same));
        assertTrue(subject.method2(same, same));

        assertTrue(subject.method1(new byte[]{1, 2, 3}, new byte[]{1, 2, 3}));
        assertTrue(subject.method2(new byte[]{1, 2, 3}, new byte[]{1, 2, 3}));

        assertFalse(subject.method1(new byte[]{1, 2, 3}, new byte[]{1, 2, 4}));
        assertFalse(subject.method2(new byte[]{1, 2, 3}, new byte[]{1, 2, 4}));

        assertFalse(subject.method1(new byte[]{1, 2}, new byte[]{1, 2, 3}));
        assertFalse(subject.method2(new byte[]{1, 2}, new byte[]{1, 2, 3}));

        assertFalse(subject.method1(null, new byte[]{1}));
        assertFalse(subject.method2(null, new byte[]{1}));

        assertTrue(subject.method1(null, null));
        assertTrue(subject.method2(null, null));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(new byte[]{1}, null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(new byte[]{1}, null));
    }
}
