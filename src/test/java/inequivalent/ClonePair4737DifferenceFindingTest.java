package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair4737DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4737 clonePair = new ClonePair4737();

        String key = "a";
        String[] values = {key, key, "b"};

        assertEquals(0, clonePair.method1(values, key, 0, 2));
        assertEquals(1, clonePair.method2(values, key, 0, 2));
    }
}
