package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ClonePair9190DifferenceFindingTest {
    @Test
    void methodsUseDifferentInverseNormalApproximations() {
        ClonePair9190 clonePair = new ClonePair9190();

        assertNotEquals(clonePair.method1(0.1), clonePair.method2(0.1));
    }
}
