package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7927DifferenceFindingTest {
    @Test
    void methodsCompareWordContainmentAndWhitespaceDifferently() {
        ClonePair7927 clonePair = new ClonePair7927();

        assertTrue(clonePair.method1("a b", "a"));
        assertFalse(clonePair.method2("a b", "a"));
    }
}
