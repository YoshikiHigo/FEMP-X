package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8051DifferenceFindingTest {
    @Test
    void methodsHandleCaseDifferently() {
        ClonePair8051 clonePair = new ClonePair8051();
        String[] values = {"A"};

        assertEquals(-1, clonePair.method1(values, "a"));
        assertEquals(0, clonePair.method2(values, "a"));
    }
}
