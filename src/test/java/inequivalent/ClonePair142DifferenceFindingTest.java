package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair142DifferenceFindingTest {

    private final ClonePair142 subject = new ClonePair142();

    @Test
    void methodsTreatEmptyMatricesDifferently() {
        boolean[][] left = new boolean[0][0];
        boolean[][] right = new boolean[0][0];

        assertFalse(subject.method1(left, right));
        assertTrue(subject.method2(left, right));
    }
}
