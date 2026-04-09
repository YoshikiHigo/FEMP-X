package equivalent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair65DifferenceFindingTest {

    private final ClonePair65 subject = new ClonePair65();

    @Test
    void methodsTreatLeadingEmptyStringDifferently() {
        assertEquals(",b", subject.method1(Arrays.asList("", "b"), ","));
        assertEquals("b", subject.method2(Arrays.asList("", "b"), ","));
    }
}
