package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7505DifferenceFindingTest {
    @Test
    void methodsUseEqualityAndIdentityDifferently() {
        ClonePair7505 clonePair = new ClonePair7505();

        assertTrue(clonePair.method1(new String("a"), new String("a")));
        assertFalse(clonePair.method2(new String("a"), new String("a")));
    }
}
