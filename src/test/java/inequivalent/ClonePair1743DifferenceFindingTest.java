package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1743DifferenceFindingTest {

    private final ClonePair1743 subject = new ClonePair1743();

    @Test
    void methodsFormatNonEmptyListDifferently() {
        assertEquals("a, b", subject.method1(List.of("a", "b")));
        assertEquals("['a','b']", subject.method2(List.of("a", "b")));
    }
}
