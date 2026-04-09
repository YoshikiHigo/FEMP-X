package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair523NoDifferenceTest {

    private final ClonePair523 subject = new ClonePair523();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertTrue(subject.method1(null, null));
        assertTrue(subject.method2(null, null));

        assertFalse(subject.method1(null, new byte[]{1}));
        assertFalse(subject.method2(null, new byte[]{1}));

        assertTrue(subject.method1(new byte[]{}, new byte[]{}));
        assertTrue(subject.method2(new byte[]{}, new byte[]{}));

        assertTrue(subject.method1(new byte[]{1, 2, 3}, new byte[]{1, 2, 3}));
        assertTrue(subject.method2(new byte[]{1, 2, 3}, new byte[]{1, 2, 3}));

        assertFalse(subject.method1(new byte[]{1, 2}, new byte[]{1, 2, 3}));
        assertFalse(subject.method2(new byte[]{1, 2}, new byte[]{1, 2, 3}));

        assertFalse(subject.method1(new byte[]{1, 2, 3}, new byte[]{1, 2, 4}));
        assertFalse(subject.method2(new byte[]{1, 2, 3}, new byte[]{1, 2, 4}));
    }
}
