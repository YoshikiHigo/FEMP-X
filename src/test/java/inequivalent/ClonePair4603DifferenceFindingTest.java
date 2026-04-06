package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair4603DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4603 clonePair = new ClonePair4603();

        float[][] values = {{16_777_216.0f, 1.0f, -16_777_216.0f}};

        assertEquals(1.0, clonePair.method1(values));
        assertEquals(0.0, clonePair.method2(values));
    }
}
