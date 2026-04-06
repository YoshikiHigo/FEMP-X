package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7890DifferenceFindingTest {
    @Test
    void methodsHandleCaseDifferently() {
        ClonePair7890 clonePair = new ClonePair7890();

        assertEquals(0, clonePair.method1(new StringBuffer("Ab"), 0, new String[]{"a"}));
        assertEquals(-1, clonePair.method2(new StringBuffer("Ab"), 0, new String[]{"a"}));
    }
}
