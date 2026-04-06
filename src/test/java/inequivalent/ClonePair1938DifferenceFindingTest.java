package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair1938DifferenceFindingTest {

    private final ClonePair1938 subject = new ClonePair1938();

    @Test
    void methodsTreatCaseDifferently() {
        Vector<String> left = new Vector<>(java.util.List.of("a"));
        Vector<String> right = new Vector<>(java.util.List.of("A"));

        assertFalse(subject.method1(left, right));
        assertTrue(subject.method2(left, right));
    }
}
