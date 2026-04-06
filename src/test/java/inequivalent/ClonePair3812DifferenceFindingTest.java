package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3812DifferenceFindingTest {

    private final ClonePair3812 subject = new ClonePair3812();

    @Test
    void methodsTreatDelCharacterDifferently() {
        char[] method1Out = new char[16];
        char[] method2Out = new char[16];
        char[] input = {127};

        int method1Length = subject.method1(input, 0, 1, method1Out);
        int method2Length = subject.method2(input, 0, 1, method2Out);

        assertEquals(6, method1Length);
        assertEquals(1, method2Length);
        assertEquals("&#127;", new String(method1Out, 0, method1Length));
        assertEquals(String.valueOf((char) 127), new String(method2Out, 0, method2Length));
    }
}
