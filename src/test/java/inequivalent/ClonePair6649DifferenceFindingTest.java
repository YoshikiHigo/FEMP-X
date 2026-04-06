package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair6649DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6649 clonePair = new ClonePair6649();
        Map<String, String> map = new HashMap<>();
        map.put("key", "");

        assertEquals("default", clonePair.method1(map, "key", "default"));
        assertEquals("", clonePair.method2(map, "key", "default"));
    }
}
