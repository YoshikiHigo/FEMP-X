package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8020DifferenceFindingTest {
    @Test
    void methodsUseDifferentSeparators() {
        ClonePair8020 clonePair = new ClonePair8020();

        assertEquals("a.b", clonePair.method1(Arrays.asList("a", "b")));
        assertEquals("a+b", clonePair.method2(Arrays.asList("a", "b")));
    }
}
