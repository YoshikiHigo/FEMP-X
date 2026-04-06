package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair2006DifferenceFindingTest {

    private final ClonePair2006 subject = new ClonePair2006();

    @Test
    void methodsFormatListDifferently() {
        assertEquals("a,b", subject.method1(List.of("a", "b")));
        assertEquals("1=a\n2=b\n", subject.method2(List.of("a", "b")));
    }
}
