package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3594DifferenceFindingTest {

    private final ClonePair3594 subject = new ClonePair3594();

    @Test
    void method1IgnoresLastElementButMethod2DoesNot() {
        assertTrue(subject.method1(new int[]{1, 2}, new int[]{1, 3}));
        assertFalse(subject.method2(new int[]{1, 2}, new int[]{1, 3}));
    }
}
