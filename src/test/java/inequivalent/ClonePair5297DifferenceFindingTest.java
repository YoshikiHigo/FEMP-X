package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5297DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5297 clonePair = new ClonePair5297();

        assertEquals(0, clonePair.method1(new char[]{'\f'}, 0));
        assertEquals(1, clonePair.method2(new char[]{'\f'}, 0));
    }
}
