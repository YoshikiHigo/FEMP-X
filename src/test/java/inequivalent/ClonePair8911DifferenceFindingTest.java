package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8911DifferenceFindingTest {
    @Test
    void methodsHandleTagCaseDifferently() {
        ClonePair8911 clonePair = new ClonePair8911();
        HashMap<String, String> glossary = new HashMap<>();
        glossary.put("name", "x");

        assertEquals("x", clonePair.method1("`NAME`", glossary));
        assertEquals("`NAME`", clonePair.method2("`NAME`", glossary));
    }
}
