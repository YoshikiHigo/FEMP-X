package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10977DifferenceFindingTest {
    @Test
    void methodsHandleCharactersAfterByteCastDifferently() {
        ClonePair10977 clonePair = new ClonePair10977();

        assertEquals((byte) -1, clonePair.method1('\u0141'));
        assertEquals((byte) 0, clonePair.method2('\u0141'));
    }
}
