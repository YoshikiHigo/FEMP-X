package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair13256DifferenceFindingTest {

    private final ClonePair13256 subject = new ClonePair13256();

    @Test
    void methodsHandleEmbeddedSpaceDifferently() {
        assertArrayEquals(new byte[]{1}, subject.method1("0 1"));
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method2("0 1"));
    }
}
