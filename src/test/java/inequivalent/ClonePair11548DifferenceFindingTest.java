package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11548DifferenceFindingTest {
    @Test
    void methodsHandleHundredTeenOrdinalsDifferently() {
        ClonePair11548 clonePair = new ClonePair11548();

        assertEquals("111st", clonePair.method1(111));
        assertEquals("111th", clonePair.method2(111));
    }
}
