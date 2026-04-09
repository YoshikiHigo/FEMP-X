package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair26DifferenceFindingTest {

    private final ClonePair26 subject = new ClonePair26();

    @Test
    void method2ParsesTrailingDotZeroButMethod1ReturnsNull() {
        String input = "1.0";

        assertNull(subject.method1(input));
        assertEquals(Long.valueOf(1L), subject.method2(input));
    }
}
