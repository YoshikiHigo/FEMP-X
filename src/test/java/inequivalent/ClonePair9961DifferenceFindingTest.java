package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair9961DifferenceFindingTest {
    @Test
    void methodsStripLeadingCharactersDifferently() {
        ClonePair9961 clonePair = new ClonePair9961();

        assertArrayEquals(new String[]{"bc"}, clonePair.method1(Collections.singletonList("abc")));
        assertArrayEquals(new String[]{"abc"}, clonePair.method2(Collections.singletonList("abc")));
    }
}
