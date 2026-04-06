package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8554DifferenceFindingTest {
    @Test
    void methodsRemoveSuffixAndFirstOccurrenceDifferently() {
        ClonePair8554 clonePair = new ClonePair8554();

        assertEquals("a/b", clonePair.method1("a/b/", "/"));
        assertEquals("a", clonePair.method2("a/b/", "/"));
    }
}
