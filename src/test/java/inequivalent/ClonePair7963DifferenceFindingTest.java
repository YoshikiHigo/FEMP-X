package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7963DifferenceFindingTest {
    @Test
    void methodsKeepEmptyTokensDifferently() {
        ClonePair7963 clonePair = new ClonePair7963();

        assertEquals(Arrays.asList("a", "b"), clonePair.method1("a,,b", ","));
        assertEquals(Arrays.asList("a", "", "b"), clonePair.method2("a,,b", ","));
    }
}
