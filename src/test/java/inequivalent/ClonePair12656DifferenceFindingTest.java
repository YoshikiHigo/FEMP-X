package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12656DifferenceFindingTest {
    @Test
    void onlyMethod2DistinguishesSignedZero() {
        ClonePair12656 clonePair = new ClonePair12656();
        float[] values = {0.0f};

        assertEquals(0, clonePair.method1(values, -0.0f, 0, 0));
        assertEquals(-1, clonePair.method2(values, -0.0f, 0, 0));
    }
}
