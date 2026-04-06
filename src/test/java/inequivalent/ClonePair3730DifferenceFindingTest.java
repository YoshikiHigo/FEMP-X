package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.BitSet;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ClonePair3730DifferenceFindingTest {

    private final ClonePair3730 subject = new ClonePair3730();

    @Test
    void methodsHandleHighLongBitsDifferently() {
        BitSet method1 = subject.method1(1L << 32, 64);
        BitSet method2 = subject.method2(1L << 32, 64);

        assertNotEquals(method1, method2);
    }
}
