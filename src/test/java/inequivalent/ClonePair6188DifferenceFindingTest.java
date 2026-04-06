package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6188DifferenceFindingTest {
    @Test
    void methodsCompareListsDifferently() {
        ClonePair6188 clonePair = new ClonePair6188();

        assertTrue(clonePair.method1(Collections.singletonList("a"), Arrays.asList("a", "b")));
        assertFalse(clonePair.method2(Collections.singletonList("a"), Arrays.asList("a", "b")));
    }
}
