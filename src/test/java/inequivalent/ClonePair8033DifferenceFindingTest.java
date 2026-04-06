package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8033DifferenceFindingTest {
    @Test
    void methodsHandleThousandsAboveThreeDifferently() {
        ClonePair8033 clonePair = new ClonePair8033();

        assertEquals("MMMM", clonePair.method1(4000));
        assertEquals("", clonePair.method2(4000));
    }
}
