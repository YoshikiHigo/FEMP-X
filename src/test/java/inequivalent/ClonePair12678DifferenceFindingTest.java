package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12678DifferenceFindingTest {
    @Test
    void methodsHandleRepeatedWhitespaceDifferently() {
        ClonePair12678 clonePair = new ClonePair12678();

        assertEquals(Arrays.asList("a", "", "b"), clonePair.method1("a  b"));
        assertEquals(Arrays.asList("a", "b"), clonePair.method2("a  b"));
    }
}
