package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7091DifferenceFindingTest {
    @Test
    void methodsNormalizeSlashesDifferently() {
        ClonePair7091 clonePair = new ClonePair7091();

        assertFalse(clonePair.method1(Collections.singletonList("a/b"), "a b"));
        assertTrue(clonePair.method2(Collections.singletonList("a/b"), "a b"));
    }
}
