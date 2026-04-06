package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12414DifferenceFindingTest {
    @Test
    void methodsHandleNullParametersAndTrimDifferently() {
        ClonePair12414 clonePair = new ClonePair12414();

        assertEquals(" a ", clonePair.method1(" a ", null, null));
        assertEquals("a", clonePair.method2(" a ", null, null));
    }
}
