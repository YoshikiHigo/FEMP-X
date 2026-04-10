package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8905DifferenceFindingTest {

    private final ClonePair8905 subject = new ClonePair8905();

    @Test
    void methodsReturnDifferentValuesForHugePositiveAngle() {
        double input = Double.MAX_VALUE;

        assertEquals(-52.0, subject.method1(input));
        assertEquals(0.0, subject.method2(input));
    }
}
