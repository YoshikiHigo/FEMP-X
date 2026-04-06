package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair2001DifferenceFindingTest {

    private final ClonePair2001 subject = new ClonePair2001();

    @Test
    void methodsHandleElementSpacingDifferently() {
        assertEquals("ab", subject.method1(List.of("a", "b")));
        assertEquals("a b ", subject.method2(List.of("a", "b")));
    }
}
