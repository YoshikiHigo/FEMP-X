package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair13451DifferenceFindingTest {

    private final ClonePair13451 subject = new ClonePair13451();

    @Test
    void methodsReturnDifferentValuesWhenReplacementOccursMultipleTimes() {
        assertEquals("aax", subject.method1("aaa", "a", "x"));
        assertEquals("xxx", subject.method2("aaa", "a", "x"));
    }
}
