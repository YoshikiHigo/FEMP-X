package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12490DifferenceFindingTest {
    @Test
    void methodsAggregateValuesDifferently() {
        ClonePair12490 clonePair = new ClonePair12490();
        short[] values = {2, 3};

        assertEquals(5, clonePair.method1(0, 2, values));
        assertEquals(6, clonePair.method2(0, 2, values));
    }
}
