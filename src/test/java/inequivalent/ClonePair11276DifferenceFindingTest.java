package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11276DifferenceFindingTest {
    @Test
    void methodsCountOverlappingMatchesDifferently() {
        ClonePair11276 clonePair = new ClonePair11276();

        assertEquals(1, clonePair.method1("aaa", "aa"));
        assertEquals(2, clonePair.method2("aaa", "aa"));
    }
}
