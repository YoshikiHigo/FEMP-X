package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12311DifferenceFindingTest {
    @Test
    void methodsEscapeNewlineDifferently() {
        ClonePair12311 clonePair = new ClonePair12311();

        assertEquals("<br>", clonePair.method1("\n"));
        assertEquals("\n", clonePair.method2("\n"));
    }
}
