package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1237DifferenceFindingTest {

    private final ClonePair1237 subject = new ClonePair1237();

    @Test
    void methodsHandleOddTrailingByteDifferently() {
        assertEquals(256, subject.method1(new byte[]{1}).charAt(0));
        assertEquals(1, subject.method2(new byte[]{1}).charAt(0));
    }
}
