package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ClonePair9312DifferenceFindingTest {
    @Test
    void methodsUseSlightlyDifferentSeriesConstants() {
        ClonePair9312 clonePair = new ClonePair9312();

        assertNotEquals(clonePair.method1(0.5), clonePair.method2(0.5));
    }
}
