package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7996DifferenceFindingTest {
    @Test
    void methodsHandleCollinearPointPastEndpointDifferently() {
        ClonePair7996 clonePair = new ClonePair7996();

        assertEquals(0, clonePair.method1(0.0, 0.0, 1.0, 0.0, 2.0, 0.0));
        assertEquals(1, clonePair.method2(0.0, 0.0, 1.0, 0.0, 2.0, 0.0));
    }
}
