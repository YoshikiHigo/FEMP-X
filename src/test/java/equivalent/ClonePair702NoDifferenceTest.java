package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair702NoDifferenceTest {

    private final ClonePair702 subject = new ClonePair702();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        byte[] same = {1, 2, 3};
        assertTrue(subject.method1(same, same));
        assertTrue(subject.method2(same, same));

        assertTrue(subject.method1(new byte[]{1, 2, 3}, new byte[]{1, 2, 3}));
        assertTrue(subject.method2(new byte[]{1, 2, 3}, new byte[]{1, 2, 3}));

        assertFalse(subject.method1(new byte[]{1, 2, 3}, new byte[]{1, 2, 4}));
        assertFalse(subject.method2(new byte[]{1, 2, 3}, new byte[]{1, 2, 4}));

        assertFalse(subject.method1(new byte[]{1}, new byte[]{1, 2}));
        assertFalse(subject.method2(new byte[]{1}, new byte[]{1, 2}));

        assertFalse(subject.method1(null, new byte[]{1}));
        assertFalse(subject.method2(null, new byte[]{1}));

        assertTrue(subject.method1(null, null));
        assertTrue(subject.method2(null, null));
    }
}
