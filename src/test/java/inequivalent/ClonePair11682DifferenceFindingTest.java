package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11682DifferenceFindingTest {
    @Test
    void method1RepeatsReplacementUntilStable() {
        ClonePair11682 clonePair = new ClonePair11682();

        assertEquals("a", clonePair.method1("abb", "ab", "a"));
        assertEquals("ab", clonePair.method2("abb", "ab", "a"));
    }
}
