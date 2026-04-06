package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9665DifferenceFindingTest {
    @Test
    void methodsBuildDifferentReplacementPrefixes() {
        ClonePair9665 clonePair = new ClonePair9665();

        assertEquals(
                "href server?file=x ",
                clonePair.method1("href x ", "", "", "phase", "href", "server"));
        assertEquals(
                "href server?phase=phase&file=x ",
                clonePair.method2("href x ", "", "", "phase", "href", "server"));
    }
}
