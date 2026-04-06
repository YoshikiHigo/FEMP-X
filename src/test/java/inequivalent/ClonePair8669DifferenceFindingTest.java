package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8669DifferenceFindingTest {
    @Test
    void methodsRoundUpAndDownDifferently() {
        ClonePair8669 clonePair = new ClonePair8669();

        assertEquals(2, clonePair.method1(1.5));
        assertEquals(1, clonePair.method2(1.5));
    }
}
