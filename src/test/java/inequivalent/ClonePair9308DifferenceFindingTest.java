package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9308DifferenceFindingTest {
    @Test
    void methodsEscapeQuotesDifferently() {
        ClonePair9308 clonePair = new ClonePair9308();

        assertEquals("\"", clonePair.method1(new char[]{'"'}, 0, 1));
        assertEquals("&quot;", clonePair.method2(new char[]{'"'}, 0, 1));
    }
}
