package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4057DifferenceFindingTest {

    private final ClonePair4057 subject = new ClonePair4057();

    @Test
    void methodsHandleNaNAndNegativeYDifferently() {
        assertTrue(Double.isNaN(subject.method1(Double.NaN, -1.0)));
        assertEquals(0.0, subject.method2(Double.NaN, -1.0));
    }
}
