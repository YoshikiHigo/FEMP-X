package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair6671DifferenceFindingTest {
    @Test
    void onlyMethod1SortsItemsBeforeJoining() {
        ClonePair6671 clonePair = new ClonePair6671();

        assertEquals("a,b", clonePair.method1(Arrays.asList("b", "a"), ","));
        assertEquals("b,a", clonePair.method2(Arrays.asList("b", "a"), ","));
    }
}
