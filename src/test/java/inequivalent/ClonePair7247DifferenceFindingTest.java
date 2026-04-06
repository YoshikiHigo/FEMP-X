package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7247DifferenceFindingTest {
    @Test
    void methodsHandleCenturyLeapYearsDifferently() {
        ClonePair7247 clonePair = new ClonePair7247();

        assertEquals(28, clonePair.method1(2, 1900));
        assertEquals(29, clonePair.method2(2, 1900));
    }
}
