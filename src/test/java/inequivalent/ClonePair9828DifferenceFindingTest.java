package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9828DifferenceFindingTest {
    @Test
    void methodsCompareNumericComponentsDifferentlyFromStrings() {
        ClonePair9828 clonePair = new ClonePair9828();

        assertEquals(-1, clonePair.method1("2", "10"));
        assertEquals(1, clonePair.method2("2", "10"));
    }
}
