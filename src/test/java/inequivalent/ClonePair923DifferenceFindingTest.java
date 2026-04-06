package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair923DifferenceFindingTest {

    private final ClonePair923 subject = new ClonePair923();

    @Test
    void methodsHandleNullBufferDifferentlyWhenLengthIsZero() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, 0));
        assertEquals("", subject.method2(null, 0));
    }
}
