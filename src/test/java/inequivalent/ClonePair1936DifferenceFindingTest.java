package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair1936DifferenceFindingTest {

    private final ClonePair1936 subject = new ClonePair1936();

    @Test
    void methodsTreatOrderingDifferently() {
        Vector<String> left = new Vector<>(java.util.List.of("a", "b"));
        Vector<String> right = new Vector<>(java.util.List.of("b", "a"));

        assertFalse(subject.method1(left, right));
        assertTrue(subject.method2(left, right));
    }
}
