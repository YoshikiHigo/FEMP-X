package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7895DifferenceFindingTest {
    @Test
    void methodsHandleCenturyLeapYearsDifferently() {
        ClonePair7895 clonePair = new ClonePair7895();

        assertEquals(29, clonePair.method1(2, 1900));
        assertEquals(28, clonePair.method2(2, 1900));
    }
}
