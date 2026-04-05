package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair53DifferenceTest {

    private final ClonePair53 subject = new ClonePair53();

    @Test
    void methodsDivergeBetweenSummationAndMaximum() {
        assertEquals(Long.valueOf(3L), subject.method1(1L, 2L));
        assertEquals(Long.valueOf(2L), subject.method2(1L, 2L));
    }
}
