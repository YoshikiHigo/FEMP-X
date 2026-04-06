package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8325DifferenceFindingTest {
    @Test
    void methodsRejectSpecificPackagePrefixesDifferently() {
        ClonePair8325 clonePair = new ClonePair8325();
        String input = "com.limegroup.gnutella org.limewire X after";

        assertTrue(clonePair.method1(input, "X"));
        assertFalse(clonePair.method2(input, "X"));
    }
}
