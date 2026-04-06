package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair53DifferenceFindingTest {

    private final ClonePair53 subject = new ClonePair53();

    @Test
    void methodsAggregateLongArgumentsDifferently() {
        assertEquals(7L, subject.method1(3L, 4L));
        assertEquals(4L, subject.method2(3L, 4L));
    }
}
