package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10818DifferenceFindingTest {
    @Test
    void methodsUseOffsetDifferently() {
        ClonePair10818 clonePair = new ClonePair10818();
        byte[] bytes = {1, 2};

        assertEquals(1L, clonePair.method1(bytes, 1, 1, true));
        assertEquals(2L, clonePair.method2(bytes, 1, 1, true));
    }
}
