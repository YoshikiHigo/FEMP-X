package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1846DifferenceFindingTest {

    private final ClonePair1846 subject = new ClonePair1846();

    @Test
    void methodsUseDifferentSeparators() {
        assertEquals("a b", subject.method1(List.of("a", "b")));
        assertEquals("a, b", subject.method2(List.of("a", "b")));
    }
}
