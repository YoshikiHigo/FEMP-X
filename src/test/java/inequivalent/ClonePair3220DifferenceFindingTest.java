package inequivalent;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3220DifferenceFindingTest {

    private final ClonePair3220 subject = new ClonePair3220();

    @Test
    void methodsCompareComparableObjectsAndStringsDifferently() {
        assertTrue(subject.method1(new BigDecimal("2"), new BigDecimal("10")) > 0);
        assertTrue(subject.method2(new BigDecimal("2"), new BigDecimal("10")) < 0);
    }
}
