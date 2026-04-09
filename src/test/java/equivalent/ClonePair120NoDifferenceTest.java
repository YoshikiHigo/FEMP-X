package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair120NoDifferenceTest {

    private final ClonePair120 subject = new ClonePair120();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertSameResult(0.2, 0.8, -0.1, 0.2);
        assertSameResult(0.2, 0.8, 0.1, 0.56);
        assertSameResult(0.2, 0.8, 0.3, 0.8);
        assertSameResult(0.2, 0.8, 0.5, 0.8);
        assertSameResult(0.2, 0.8, 0.8, 0.2);
        assertSameResult(0.2, 0.8, 1.1, 0.56);
    }

    private void assertSameResult(double p, double q, double tc, double expected) {
        assertEquals(expected, subject.method1(p, q, tc), 1.0e-12);
        assertEquals(expected, subject.method2(p, q, tc), 1.0e-12);
    }
}
