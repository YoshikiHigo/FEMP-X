package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10814DifferenceFindingTest {
    @Test
    void methodsAdvanceValueIndexDifferently() {
        ClonePair10814 clonePair = new ClonePair10814();

        assertEquals("1", clonePair.method1("a,b", "1,2", ",").get("b"));
        assertEquals("2", clonePair.method2("a,b", "1,2", ",").get("b"));
    }
}
