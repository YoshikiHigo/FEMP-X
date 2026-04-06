package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ClonePair10135DifferenceFindingTest {
    @Test
    void methodsApproximateAtanDifferently() {
        ClonePair10135 clonePair = new ClonePair10135();

        assertNotEquals(clonePair.method1(1.0), clonePair.method2(1.0));
    }
}
