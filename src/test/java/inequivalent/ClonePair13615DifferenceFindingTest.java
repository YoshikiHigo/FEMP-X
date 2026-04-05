package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair13615DifferenceFindingTest {

    private final ClonePair13615 subject = new ClonePair13615();

    @Test
    void methodsHaveDifferentExceptionBehaviorForSignedHexPair() {
        assertArrayEquals(new byte[]{1}, subject.method1("+1"));

        NumberFormatException thrown = assertThrows(NumberFormatException.class, () -> subject.method2("+1"));
        assertEquals("Sign character in wrong position", thrown.getMessage());
    }
}
