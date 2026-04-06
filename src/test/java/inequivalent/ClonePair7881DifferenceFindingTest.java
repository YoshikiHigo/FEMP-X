package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7881DifferenceFindingTest {
    @Test
    void methodsHandleTriposHeaderDifferently() {
        ClonePair7881 clonePair = new ClonePair7881();
        String[] lines = {"@<TRIPOS>", "", "", "001002"};

        assertFalse(clonePair.method1(lines));
        assertTrue(clonePair.method2(lines));
    }
}
