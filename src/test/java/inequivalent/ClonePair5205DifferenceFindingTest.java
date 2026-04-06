package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5205DifferenceFindingTest {

    private final ClonePair5205 subject = new ClonePair5205();

    @Test
    void methodsReturnDifferentMatchingPositionsWhenCharacterAppearsTwice() {
        assertEquals(0, subject.method1("010", '0'));
        assertEquals(2, subject.method2("010", '0'));
    }
}
