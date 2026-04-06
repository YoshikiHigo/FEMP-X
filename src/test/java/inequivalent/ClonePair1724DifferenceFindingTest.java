package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1724DifferenceFindingTest {

    private final ClonePair1724 subject = new ClonePair1724();

    @Test
    void methodsUseDifferentCommaSeparators() {
        assertEquals("a,b", subject.method1(List.of("a", "b")));
        assertEquals("a, b", subject.method2(List.of("a", "b")));
    }
}
