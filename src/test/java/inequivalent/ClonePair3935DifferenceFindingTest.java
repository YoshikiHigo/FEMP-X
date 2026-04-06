package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3935DifferenceFindingTest {

    private final ClonePair3935 subject = new ClonePair3935();

    @Test
    void methodsDecodeBooleanBitsDifferently() {
        boolean[] bits = {true, true};

        assertEquals(1.0, subject.method1(bits, 0, 2, 0.0, 1.0));
        assertEquals(1.0 / 3.0, subject.method2(bits, 0, 2, 0.0, 1.0));
    }
}
