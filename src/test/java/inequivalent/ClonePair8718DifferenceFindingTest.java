package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8718DifferenceFindingTest {
    @Test
    void methodsUseDifferentDefaultColumnClasses() {
        ClonePair8718 clonePair = new ClonePair8718();

        assertEquals(String.class, clonePair.method1(5));
        assertEquals(Object.class, clonePair.method2(5));
    }
}
