package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair13008DifferenceFindingTest {

    private final ClonePair13008 subject = new ClonePair13008();

    @Test
    void methodsHaveDifferentExceptionBehaviorForLargeAddressChunk() {
        assertEquals(16777216L, subject.method1("2147483649"));
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method2("2147483649"));
    }
}
