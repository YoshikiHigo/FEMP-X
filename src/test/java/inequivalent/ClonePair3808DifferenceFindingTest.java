package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3808DifferenceFindingTest {

    private final ClonePair3808 subject = new ClonePair3808();

    @Test
    void methodsEscapeNonAsciiCharactersDifferently() {
        char[] method1Out = new char[16];
        char[] method2Out = new char[16];
        char[] input = {'\u00E9'};

        int method1Length = subject.method1(input, 0, 1, method1Out);
        int method2Length = subject.method2(input, 0, 1, method2Out);

        assertEquals(1, method1Length);
        assertEquals(6, method2Length);
        assertEquals("\u00E9", new String(method1Out, 0, method1Length));
        assertEquals("&#233;", new String(method2Out, 0, method2Length));
    }
}
