package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair4156DifferenceFindingTest {

    private final ClonePair4156 subject = new ClonePair4156();

    @Test
    void methodsClampAndWrapDifferently() {
        assertEquals(10.0f, subject.method1(0.0f, 10.0f, 12.0f));
        assertEquals(2.0f, subject.method2(0.0f, 10.0f, 12.0f));
    }
}
