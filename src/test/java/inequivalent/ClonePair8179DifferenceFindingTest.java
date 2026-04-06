package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8179DifferenceFindingTest {
    @Test
    void methodsHandleSubclassInstancesDifferently() {
        ClonePair8179 clonePair = new ClonePair8179();
        ClonePair8179 subclassInstance = new SameHashSubclass(clonePair.hashCode());

        assertFalse(clonePair.method1(subclassInstance));
        assertTrue(clonePair.method2(subclassInstance));
    }

    private static class SameHashSubclass extends ClonePair8179 {
        private final int hashCode;

        private SameHashSubclass(int hashCode) {
            this.hashCode = hashCode;
        }

        @Override
        public int hashCode() {
            return hashCode;
        }
    }
}
