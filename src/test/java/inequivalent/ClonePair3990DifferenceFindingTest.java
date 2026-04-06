package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3990DifferenceFindingTest {

    private final ClonePair3990 subject = new ClonePair3990();

    @Test
    void methodsTreatEscapedSearchCharacterDifferently() {
        assertEquals("\\b", subject.method1("\\a", 'a', 'b'));
        assertEquals("\\a", subject.method2("\\a", 'a', 'b'));
    }
}
