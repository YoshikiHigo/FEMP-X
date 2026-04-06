package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12827DifferenceFindingTest {
    @Test
    void onlyMethod2TrimsJoinedArguments() {
        ClonePair12827 clonePair = new ClonePair12827();
        String[] args = {" a "};

        assertEquals(" a ", clonePair.method1(args, 0));
        assertEquals("a", clonePair.method2(args, 0));
    }
}
