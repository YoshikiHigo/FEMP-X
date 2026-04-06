package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12614DifferenceFindingTest {
    @Test
    void methodsCompareCaseDifferently() {
        ClonePair12614 clonePair = new ClonePair12614();
        String[] filters = {"A"};

        assertTrue(clonePair.method1("a", filters));
        assertFalse(clonePair.method2("a", filters));
    }
}
