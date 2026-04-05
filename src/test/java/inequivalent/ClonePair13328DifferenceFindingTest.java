package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ClonePair13328DifferenceFindingTest {

    private final ClonePair13328 subject = new ClonePair13328();

    @Test
    void methodsHandleNegativeStartDifferently() {
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new byte[]{0, 1, 2}, -1));
        assertFalse(subject.method2(new byte[]{0, 1, 2}, -1));
    }
}
