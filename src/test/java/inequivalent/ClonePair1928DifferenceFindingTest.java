package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1928DifferenceFindingTest {

    private final ClonePair1928 subject = new ClonePair1928();

    @Test
    void methodsUseDifferentListSeparators() {
        assertEquals("ab", subject.method1(List.of("a", "b")));
        assertEquals("a, b", subject.method2(List.of("a", "b")));
    }
}
