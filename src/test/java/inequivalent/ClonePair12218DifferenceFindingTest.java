package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12218DifferenceFindingTest {
    @Test
    void methodsCompareListElementsWithDifferentCaseSensitivity() {
        ClonePair12218 clonePair = new ClonePair12218();

        assertTrue(clonePair.method1(Collections.singletonList("A"), Collections.singletonList("a")));
        assertFalse(clonePair.method2(Collections.singletonList("A"), Collections.singletonList("a")));
    }
}
