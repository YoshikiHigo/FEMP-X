package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11272DifferenceFindingTest {
    @Test
    void methodsCheckExactAndSubstringMatchesDifferently() {
        ClonePair11272 clonePair = new ClonePair11272();

        assertFalse(clonePair.method1("ba", Collections.singletonList("a")));
        assertTrue(clonePair.method2("ba", Collections.singletonList("a")));
    }
}
