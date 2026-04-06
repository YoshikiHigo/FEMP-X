package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12381DifferenceFindingTest {
    @Test
    void methodsUseUppercaseAndTitlecaseDifferently() {
        ClonePair12381 clonePair = new ClonePair12381();

        assertEquals("a\u01F1", clonePair.method1("a_\u01F3"));
        assertEquals("a\u01F2", clonePair.method2("a_\u01F3"));
    }
}
