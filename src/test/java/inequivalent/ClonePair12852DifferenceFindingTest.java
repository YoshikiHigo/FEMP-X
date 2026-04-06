package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12852DifferenceFindingTest {
    @Test
    void onlyMethod2ReplacesQuotesAndTrims() {
        ClonePair12852 clonePair = new ClonePair12852();

        assertEquals("\"a\"", clonePair.method1("\"a\"", 3));
        assertEquals("a", clonePair.method2("\"a\"", 3));
    }
}
