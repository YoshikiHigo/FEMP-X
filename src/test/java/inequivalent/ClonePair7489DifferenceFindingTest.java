package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7489DifferenceFindingTest {
    @Test
    void methodsSelectDifferentSortedPositions() {
        ClonePair7489 clonePair = new ClonePair7489();

        assertEquals(2.0, clonePair.method1(Arrays.asList(1.0, 2.0, 3.0)));
        assertEquals(3.0, clonePair.method2(Arrays.asList(1.0, 2.0, 3.0)));
    }
}
