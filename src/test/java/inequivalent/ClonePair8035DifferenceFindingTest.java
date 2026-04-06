package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8035DifferenceFindingTest {
    @Test
    void methodsCheckSuffixAndPrefixDifferently() {
        ClonePair8035 clonePair = new ClonePair8035();
        String[] supported = {"abc"};

        assertEquals(0, clonePair.method1(supported, "bc"));
        assertEquals(-1, clonePair.method2(supported, "bc"));
    }
}
