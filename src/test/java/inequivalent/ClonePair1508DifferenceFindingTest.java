package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1508DifferenceFindingTest {

    private final ClonePair1508 subject = new ClonePair1508();

    @Test
    void methodsChooseOppositeExtremaWithinRange() {
        assertEquals((byte) 0, subject.method1(new byte[]{0, 1, 2}, 0, 2));
        assertEquals((byte) 1, subject.method2(new byte[]{0, 1, 2}, 0, 2));
    }
}
