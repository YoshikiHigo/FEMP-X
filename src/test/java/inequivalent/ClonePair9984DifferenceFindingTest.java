package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9984DifferenceFindingTest {
    @Test
    void methodsMaskIntermediateValuesDifferently() {
        ClonePair9984 clonePair = new ClonePair9984();

        assertEquals(32769, clonePair.method1(65539));
        assertEquals(1, clonePair.method2(65539));
    }
}
