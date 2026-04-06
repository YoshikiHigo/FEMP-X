package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair4857DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4857 clonePair = new ClonePair4857();

        assertEquals('A', clonePair.method1('\uFF21'));
        assertEquals('\uFF21', clonePair.method2('\uFF21'));
    }
}
