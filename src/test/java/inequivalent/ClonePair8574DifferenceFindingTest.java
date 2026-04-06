package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8574DifferenceFindingTest {
    @Test
    void methodsHandleDiscoveryPrefixDifferently() {
        ClonePair8574 clonePair = new ClonePair8574();

        assertFalse(clonePair.method1("discovery_node", "discovery"));
        assertTrue(clonePair.method2("discovery_node", "discovery"));
    }
}
