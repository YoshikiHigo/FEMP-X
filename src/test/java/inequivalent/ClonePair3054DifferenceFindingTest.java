package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3054DifferenceFindingTest {

    private final ClonePair3054 subject = new ClonePair3054();

    @Test
    void methodsRankMultipleDotsDifferently() {
        assertTrue(subject.method1("a.b.c", "d.e") > 0);
        assertTrue(subject.method2("a.b.c", "d.e") < 0);
    }
}
